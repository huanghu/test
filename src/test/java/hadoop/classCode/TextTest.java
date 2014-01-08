package hadoop.classCode;
import org.apache.hadoop.io.Text;
import org.junit.Before;
import org.junit.Test;

public class TextTest {
	
	Text t1 = null;
	Text t2 = null;
	
	@Before
	public void before(){
		t1 = new Text("1:2222");
		t2 = new Text("1:1232");
	}
	
	@Test
	public void test(){
		String s = "12";
		String s1 = "22";
		int c = s.compareTo(s1);
//		int comp = t1.compareTo(t2);
		System.out.println("c " + c);
	}
}
