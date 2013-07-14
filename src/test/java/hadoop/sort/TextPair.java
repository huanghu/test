package hadoop.sort;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

public class TextPair implements WritableComparable<TextPair> {
	
	private Text first;
	private Text second;
	
	public TextPair(){
		set(new Text(), new Text());
	}
	
	public TextPair(String first ,String second){
		set(new Text(first), new Text(second));
	}
	
	public TextPair(Text first ,Text second){
		set(first, second);
	}
	
	public void set(Text first ,Text second){
		this.first = first;
		this.second = second;
	}
	

	@Override
	public void write(DataOutput out) throws IOException {
		
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		
	}

	@Override
	public int compareTo(TextPair o) {
		return 0;
	}
	
}
