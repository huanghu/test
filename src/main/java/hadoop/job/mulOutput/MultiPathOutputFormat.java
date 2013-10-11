package hadoop.job.mulOutput;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.mapred.InvalidJobConfException;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.OutputCommitter;
import org.apache.hadoop.mapreduce.OutputFormat;
import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 多路径输出，不同的tag数据输出到不同的目录下
 * 重写checkOutputSpecs，不检测mapred.output.dir参数
 * @author wangjuntao
 */
public class MultiPathOutputFormat<K, V extends MREntityWritable> extends OutputFormat<K, V> {

	private OutputCommitter committer = null;

	public static String regex = "mapred\\.[a-zA-Z]+\\.output\\.dir";// 正则表达式匹配输出目录参数

	public static class MultiPathRecordWriter<K, V extends MREntityWritable> extends RecordWriter<K, V> {

		private Map<String, RecordWriter<K, V>> map = new HashMap<String, RecordWriter<K, V>>();// 多个输出目录

		private static Logger logger = LoggerFactory.getLogger(MultiPathRecordWriter.class);

		public MultiPathRecordWriter(TaskAttemptContext context) throws IOException, InterruptedException {
			Map<String, String> outputMap = context.getConfiguration().getValByRegex(regex);

			for (String key : outputMap.keySet()) {
				String value = outputMap.get(key);
				context.getConfiguration().set("mapred.output.dir", value);

				String tag = key.split("\\.")[1];// 实体类的tag

				MREntityTextOutputFormat<K, V> outputFormat = new MREntityTextOutputFormat<K, V>();
				map.put(tag, outputFormat.getRecordWriter(context));
				logger.info("tag:" + tag + ",outPath:" + value);
			}
		}

		@Override
		public void write(K key, V value) throws IOException, InterruptedException {
			try {
//				String tag = value.getEntity().getTag();
				String tag = "";
				RecordWriter<K, V> writer = map.get(tag);
				if (writer != null) {
					writer.write(key, value);
				}
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}

		@Override
		public void close(TaskAttemptContext context) throws IOException, InterruptedException {
			for (RecordWriter<K, V> recordWriter : map.values()) {
				recordWriter.close(context);
			}
		}

	}

	@Override
	public RecordWriter<K, V> getRecordWriter(TaskAttemptContext context) throws IOException, InterruptedException {
		return new MultiPathRecordWriter<K, V>(context);
	}

	@Override
	public void checkOutputSpecs(JobContext context) throws IOException, InterruptedException {
		Map<String, String> outputMap = context.getConfiguration().getValByRegex(regex);
		if (outputMap.size() == 0) {
			throw new InvalidJobConfException("Output directory not set. 'mapred.*.output.dir'");
		}
	}

	public synchronized OutputCommitter getOutputCommitter(TaskAttemptContext context) throws IOException {
//		if (committer == null) {
//			committer = new MultiPathOutputCommitter(context);
//		}
		return committer;
	}
}
