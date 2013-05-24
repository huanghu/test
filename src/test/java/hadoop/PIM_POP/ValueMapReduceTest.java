package hadoop.PIM_POP;

import java.net.URI;
import java.util.List;

import hadoop.job.PIM_POP.ValueMapReduce;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.filecache.DistributedCache;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.MapReduceDriver;
import org.apache.hadoop.mrunit.types.Pair;
import org.junit.Before;
import org.junit.Test;

public class ValueMapReduceTest {
	MapReduceDriver<LongWritable, Text, Text, Text, Text, Text> mrDriver;
	ValueMapReduce.Map mapper;
	ValueMapReduce.Reduce reducer;
	Configuration conf = null;
	
	private final String HOST_NAME = "hadoop-master.360buy.com"; //������Ⱥ
	private final String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private final String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	
	@Before
	public void before(){
		mrDriver = new MapReduceDriver<LongWritable, Text, Text, Text, Text, Text>();
		mapper = new ValueMapReduce.Map();
		reducer = new ValueMapReduce.Reduce();
		conf = new Configuration();
		conf.set("fs.default.name", FS_DEFAULT_NAME);
		conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
		conf.set("hadoop.job.user","huanghu");
		conf.set("mapred.job.queue.name", "erpmerge");
		mrDriver.setMapper(mapper);
		mrDriver.setReducer(reducer);
		mrDriver.setConfiguration(conf);
	}
	
	@Test
	public void test(){
		try {
//			DistributedCache.addLocalFiles(conf, "C:\\Users\\Administrator\\Desktop\\attribute.txt");
			URI har = new URI("har:///user/huanghu/cacheTest/archives/output/attributeCache.har");
			DistributedCache.addCacheArchive(har, conf);
			this.setEntity1();
			List<Pair<Text, Text>> result = mrDriver.run();
			for(Pair<Text, Text> r : result){
				System.out.println("r " + r.getSecond());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setEntity1(){
		Text inText1 = new Text();
		LongWritable key1 = new LongWritable(1); 
		inText1.set("1111	1000000041:150000000^1000000091:1500000003");
		
		Pair<LongWritable, Text> in = new Pair<LongWritable, Text>(key1, inText1);
		mrDriver.addInput(in);		
	}
}
