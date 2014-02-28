package hadoop.mapred;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.MapReduceDriver;
import org.apache.hadoop.mrunit.types.Pair;
import org.junit.Before;
import org.junit.Test;


public class MapReduceCounterTest {
	private MapReduceDriver<LongWritable ,Text ,Text ,Text ,Text ,Text> mapReduceDriver;
	private MapReduce.MapClass mapClass;
	private MapReduce.ReduceClass reduceClass;
	
	@Before
	public void before(){
		mapClass = new MapReduce.MapClass();
		reduceClass = new MapReduce.ReduceClass();
		mapReduceDriver = new MapReduceDriver<LongWritable, Text, Text, Text, Text, Text>(mapClass ,reduceClass);
	}
	
	@Test
	public void test(){
		List<Pair<Text, Text>> result = null;
		try {
			Pair<LongWritable, Text> input1 = new Pair<LongWritable, Text>(new LongWritable(1), new Text("test1"));
			Pair<LongWritable, Text> input2 = new Pair<LongWritable, Text>(new LongWritable(2), new Text("test2"));
			
			mapReduceDriver.addInput(input1);
			mapReduceDriver.addInput(input2);
			
			result = mapReduceDriver.run();
			System.out.println("result " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
