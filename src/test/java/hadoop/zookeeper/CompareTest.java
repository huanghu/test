package hadoop.zookeeper;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class CompareTest {
	List<String> nodes = null;
	
	@Before
	public void before(){
		
	}
	
	@Parameters
	public static Collection<Integer[]> getTestParameters(){
		Integer[][] integers = {
				{2 ,1 ,1} ,
				{12 ,2 ,10} ,
				{15 ,6 ,9}
			};
		return Arrays.asList(integers);
	}
}
