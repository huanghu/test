/**   
 * @title: TaggedMREntityTextOutputFormat.java 
 * @package com.jd.HadoopApp.domain.tagEntity 
 * @description: TODO 描述该文件作用 
 * @author jindazhong 
 * @date 2012-4-19 下午04:36:03 
 * @version V1.0   
 */
package hadoop.job.mulOutput;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.OutputFormat;
import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/** An {@link OutputFormat} that writes plain text files. */
public class MREntityTextOutputFormat<K, V> extends FileOutputFormat<K, V> {
	protected static class MREntityRecordWriter<K, V> extends
			RecordWriter<K, V> {
		private static final String utf8 = "UTF-8";
		private static byte[] newline;

		protected DataOutputStream out;
		private final byte[] keyValueSeparator;

		public MREntityRecordWriter(DataOutputStream out,
				String keyValueSeparator, String lineSeparator) {
			this.out = out;
			try {
				this.keyValueSeparator = keyValueSeparator.getBytes(utf8);
				if (lineSeparator != null) {
					newline = lineSeparator.getBytes(utf8);
				} else {
					newline = "\n".getBytes(utf8);
				}
			} catch (UnsupportedEncodingException uee) {
				throw new IllegalArgumentException("can't find " + utf8
						+ " encoding");
			}
		}

		/**
		 * Write the object to the byte stream, handling Text as a special case.
		 * 
		 * @param o
		 *            the object to print
		 * @throws IOException
		 *             if the write throws, we pass it on
		 */
		private void writeObject(Object o) throws IOException {
			if (o instanceof Text) {
				Text to = (Text) o;
				out.write(to.getBytes(), 0, to.getLength());
			} else {
				out.write(o.toString().getBytes(utf8));
			}
		}

		public synchronized void write(K key, V value) throws IOException {

			boolean nullKey = key == null || key instanceof NullWritable;
			boolean nullValue = value == null || value instanceof NullWritable;
			if (nullKey && nullValue) {
				return;
			}
//			if (!nullKey && key instanceof MREntityWritable) {
//				Entity entity = ((MREntityWritable) key).getEntity();
//				if (entity == null) {
//					return;
//				}
//			}
//			if (!nullValue && value instanceof MREntityWritable) {
//				Entity entity = ((MREntityWritable) value).getEntity();
//				if (entity == null) {
//					return;
//				}
//			}

			if (!nullKey) {
				writeObject(key);
			}
			if (!(nullKey || nullValue)) {
				out.write(keyValueSeparator);
			}
			if (!nullValue) {
				writeObject(value);
			}
			out.write(newline);
		}

		public synchronized void close(TaskAttemptContext context)
				throws IOException {
			out.close();
		}
	}

	public RecordWriter<K, V> getRecordWriter(TaskAttemptContext job)
			throws IOException, InterruptedException {
//		Configuration conf = job.getConfiguration();
//		boolean isCompressed = getCompressOutput(job);
//		String keyValueSeparator = conf.get(
//				"mapred.textoutputformat.separator",
//				MREntityWritable.COL_DELIMITER);
//		String lineSeparator = CommonUtil.decode(conf
//				.get(BaseConstants.LINE_SEPARATOR));
//		CompressionCodec codec = null;
//		String extension = "";
//		if (isCompressed) {
//			Class<? extends CompressionCodec> codecClass = getOutputCompressorClass(
//					job, GzipCodec.class);
//			codec = (CompressionCodec) ReflectionUtils.newInstance(codecClass,
//					conf);
//			extension = codec.getDefaultExtension();
//		}
//		Path file = getDefaultWorkFile(job, extension);
//		FileSystem fs = file.getFileSystem(conf);
//		if (!isCompressed) {
//			FSDataOutputStream fileOut = fs.create(file, false);
//			return new MREntityRecordWriter<K, V>(fileOut, keyValueSeparator,
//					lineSeparator);
//		} else {
//			FSDataOutputStream fileOut = fs.create(file, false);
//			return new MREntityRecordWriter<K, V>(new DataOutputStream(
//					codec.createOutputStream(fileOut)), keyValueSeparator,
//					lineSeparator);
//		}
		return null;
	}
}
