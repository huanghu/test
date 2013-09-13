package hadoop.job.customizeSort;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class AdKcPair implements WritableComparable<AdKcPair> {
	
	private long first;
	private long second;
	
	public AdKcPair(){
		set(new Long(0), new Long(0));
	}
	
	public AdKcPair(long first ,long second){
		set(first, second);
	}
	
	
	public void set(long first ,long second){
		this.first = first;
		this.second = second;
	}

	public long getFirst() {
		return first;
	}

	public long getSecond() {
		return second;
	}

    @Override
    public void readFields(DataInput in) throws IOException {
      first = in.readLong();
      second = in.readLong();
    }
    
    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(first);
        out.writeLong(second);
    }
	
	@Override
	public String toString(){
		return first + "\t" + second;
	}
	
    @Override
    public int hashCode() {
      return Long.valueOf(first * 157 + second).hashCode();
    }
    
    @Override
    public boolean equals(Object right) {
      if (right instanceof AdKcPair) {
    	  AdKcPair r = (AdKcPair) right;
        return r.first == first && r.second == second;
      } else {
        return false;
      }
    }

    @Override
    public int compareTo(AdKcPair o) {
      if (second != o.second) {
        return -(second < o.second ? -1 : 1);
      } else {
        return 0;
      }
    }

}