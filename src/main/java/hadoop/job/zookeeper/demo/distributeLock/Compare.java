package hadoop.job.zookeeper.demo.distributeLock;

import java.util.Comparator;

public class Compare<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		int value1 = (Integer)o1;
		int value2 = (Integer)o2;
		
		if(value1 >= value2){
			return 1;	
		}else{
			return 0;
		}
		
	}

	
}
