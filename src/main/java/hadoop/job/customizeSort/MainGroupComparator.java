package hadoop.job.customizeSort;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class MainGroupComparator extends WritableComparator {

	protected MainGroupComparator() {
		super(MainPair.class, true);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public int compare(WritableComparable w1, WritableComparable w2) {
		MainPair a1 = (MainPair)w1;
		MainPair a2 = (MainPair)w2;
		String l = a1.getFirst();
		String r = a2.getFirst();
		return l.compareTo(r);
	}


}

