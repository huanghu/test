package hadoop.job.customizeSort;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

//public class AdKcKeyComparator extends WritableComparator {
//
//	protected AdKcKeyComparator() {
//		super(AdKcPair.class, true);
//	}
//	
//	@SuppressWarnings("rawtypes")
//	@Override
//	public int compare(WritableComparable w1 ,WritableComparable w2){
//		AdKcPair ap1 = (AdKcPair)w1;
//		AdKcPair ap2 = (AdKcPair)w2;
//		int cmp = AdKcPair.compare(ap1.getFirst(), ap1.getFirst());
//		if(cmp != 0){
//			return cmp;
//		}
//		return AdKcPair.compare(ap1.getSecond(), ap2.getSecond());
//	}
//
//}
