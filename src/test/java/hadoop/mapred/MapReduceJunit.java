package hadoop.mapred;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.MapDriver;
import org.apache.hadoop.mrunit.mapreduce.ReduceDriver;
import org.apache.hadoop.mrunit.types.Pair;
import org.junit.Before;
import org.junit.Test;

public class MapReduceJunit {
	//map
	private List<Pair<Text, Text>> out = null;
	private MapReduce.MapClass map;
	private MapDriver<LongWritable ,Text ,Text ,Text> driver;
	
	//reduce
	private MapReduce.ReduceClass reduceClass;
	private ReduceDriver<Text, Text, Text, Text> reduceDriver;
	
	

	
	@Before
	public void before(){
		map = new MapReduce.MapClass();
		driver = new MapDriver<LongWritable ,Text ,Text ,Text>(map);
		
		reduceClass = new MapReduce.ReduceClass();
		reduceDriver = new ReduceDriver<Text, Text, Text, Text>(reduceClass);
	}

	@Test
	public void mapTest(){
		try {
			Configuration configuration = new Configuration();
			configuration.set("mapreduce.inputformat.class", "hadoop.job.configuration.CustomInputFormat");
			driver.setConfiguration(configuration);
			out = driver.withInput(new LongWritable(1), new Text("test")).run();
			System.out.println("out " + out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public void reduceTest(){
		List<Pair<Text, Text>> out = null;
		try {
			List<Text> values = new ArrayList<Text>();
			
			values.add(new Text("22"));
			values.add(new Text("33"));
			values.add(new Text("44"));
			
			out = reduceDriver.withInput(new Text("1") ,values).run();
			System.out.println("out " + out);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
