package hadoop.simple;

import java.io.IOException;
import java.util.List;

import hadoop.simple.MapreduceSample.Map;
import hadoop.simple.MapreduceSample.Reduce;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.MapReduceDriver;
import org.apache.hadoop.mrunit.types.Pair;
import org.junit.Before;
import org.junit.Test;

public class MapReduceTest {
	private MapReduceDriver<LongWritable, Text, Text, Text, Text, Text> driver;
	private Map map;
	private Reduce reduce;
	
	@Before
	public void before(){
		driver = new MapReduceDriver<LongWritable, Text, Text, Text, Text, Text>();
		map = new Map();
		reduce = new Reduce();
		
		driver.setMapper(map);
		driver.setReducer(reduce);
	}
	
	@Test
	public void test(){
		try {
			LongWritable key1 = new LongWritable(1);
			Text value1 = new Text("value1");
			LongWritable key2 = new LongWritable(2);
			Text value2 = new Text("value2");
			
			Pair<LongWritable, Text> in1 = new Pair<LongWritable, Text>(key1, value1);
			Pair<LongWritable, Text> in2 = new Pair<LongWritable, Text>(key2, value2);
			
			driver.addInput(in1);
			driver.addInput(in2);
			List<Pair<Text, Text>> results = driver.run();
			
			for(Pair<Text, Text> result : results){
				System.out.println("result " + result.getSecond());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
