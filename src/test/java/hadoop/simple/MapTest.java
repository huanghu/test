package hadoop.simple;

import hadoop.simple.MapreduceSample.Map;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.MapDriver;

import org.apache.hadoop.mrunit.types.Pair;
import org.junit.Before;
import org.junit.Test;

public class MapTest {
	private MapDriver<LongWritable, Text, Text, Text> driver;
	Map map;
	
	@Before
	public void before(){
		driver = new MapDriver<LongWritable, Text, Text, Text>();
		map = new Map();
		driver.setMapper(map);
	}
	
	@Test
	public void test(){
		try {
			LongWritable key = new LongWritable(1);
			Text value = new Text("value");
			
			Pair<LongWritable, Text> in = new Pair<LongWritable, Text>(key, value);
			driver.withInput(in);
			
			List<Pair<Text ,Text>> results = driver.run();
			for(Pair<Text, Text> result : results){
				System.out.println("result " + result.getSecond());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
