package hadoop.PIM_POP;

import java.io.IOException;
import java.util.List;

import hadoop.job.PIM_POP.AttributeMapRedcue;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.MapReduceDriver;
import org.apache.hadoop.mrunit.types.Pair;
import org.junit.Before;
import org.junit.Test;

public class AttributeMapReduceTest {
	MapReduceDriver<LongWritable, Text, Text, Text, Text, Text> mrDriver;
	AttributeMapRedcue.Map mapper;
	AttributeMapRedcue.Reduce reducer;
	
	@Before
	public void before(){
		mrDriver = new MapReduceDriver<LongWritable, Text, Text, Text, Text, Text>();
		mapper = new AttributeMapRedcue.Map();
		reducer = new AttributeMapRedcue.Reduce();
		mrDriver.setMapper(mapper);
		mrDriver.setReducer(reducer);
	}
	
	@Test
	public void test(){
		try {
			this.setEntity1();
			List<Pair<Text, Text>> result = mrDriver.run();
			for(Pair<Text, Text> r : result){
				System.out.println("r " + r.getSecond());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void setEntity1(){
		Text inText1 = new Text();
		LongWritable key1 = new LongWritable(1); 
		inText1.set("150000000	1000000041	红色");
		
		Pair<LongWritable, Text> in = new Pair<LongWritable, Text>(key1, inText1);
		mrDriver.addInput(in);
	}
}
