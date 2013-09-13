package hadoop.job.customizeSort;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AdKcGroupComparator extends WritableComparator {


	protected AdKcGroupComparator() {
		super(AdKcPair.class, true);
	}

	@Override
	public int compare(WritableComparable w1, WritableComparable w2) {
		AdKcPair a1 = (AdKcPair)w1;
		AdKcPair a2 = (AdKcPair)w2;
		long l = a1.getFirst();
		long r = a2.getFirst();
		return l == r ? 0 : (l < r ? -1 : 1);
	}


}

