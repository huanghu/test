package hadoop.simple;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import hadoop.simple.MapreduceSample.Reduce;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.ReduceDriver;
import org.apache.hadoop.mrunit.types.Pair;
import org.junit.Before;
import org.junit.Test;


public class ReducerTest {
	private ReduceDriver<Text, Text, Text, Text> driver;
	private Reduce reduce;
	
	@Before
	public void before(){
		driver = new ReduceDriver<Text, Text, Text, Text>();
		reduce = new Reduce();
		driver.setReducer(reduce);
	}
	
	@Test
	public void test(){

		try {
			Text value1 = new Text("value1");
			Text value2 = new Text("value2");
			
			//和MapTest不一样的地方，这边输入的是list
			List<Text> values = new ArrayList<Text>();
			values.add(value1);
			values.add(value2);
			
			driver.addInputValues(values);
			
			List<Pair<Text, Text>> results = driver.run();
			for(Pair<Text, Text> result : results){
				System.out.println("result " + result.getSecond());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
