package hadoop.job.customizeSort;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;


public class MainPartioner extends Partitioner<MainPair,Text> {
    @Override
    public int getPartition(MainPair key, Text value, 
                            int numPartitions) {
      return Math.abs(key.getFirst().hashCode() * 127) % numPartitions;
    }
}
