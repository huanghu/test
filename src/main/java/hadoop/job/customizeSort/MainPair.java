package hadoop.job.customizeSort;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class MainPair implements WritableComparable<MainPair> {
	
	private String first;
	private String second;
	
	public MainPair(){
		set(new String(), new String());
	}
	
	public MainPair(String first ,String second){
		set(first, second);
	}
	
	
	public void set(String first ,String second){
		this.first = first;
		this.second = second;
	}

	public String getFirst() {
		return first;
	}

	public String getSecond() {
		return second;
	}

    @Override
    public void readFields(DataInput in) throws IOException {
      first = in.readUTF();
      second = in.readUTF();
    }
    
    @Override
    public void write(DataOutput out) throws IOException {
        out.writeUTF(first);
        out.writeUTF(second);
    }
	
	@Override
	public String toString(){
		return first + "\t" + second;
	}
	
    @Override
    public int hashCode() {
      return first.hashCode() * 157 + second.hashCode();
    }
    
    @Override
    public boolean equals(Object right) {
    	if (right == null)
    		return false;
    	if (this == right)
    		return true;
    	if (right instanceof MainPair){
    		MainPair r = (MainPair)right;
    		return r.first.equals(first) && r.second.equals(second) ;
    	}else {
			return false;
		}
    }

    @Override
    public int compareTo(MainPair o) {
        if (!first.equals(o.first) ){
        	return first.compareTo(o.first);
        }else if (!second.equals(o.second)){
        	return -second.compareTo(o.second);
        }else{
        	return 0;
        }
    }

}