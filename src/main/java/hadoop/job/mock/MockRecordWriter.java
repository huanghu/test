package hadoop.job.mock;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockRecordWriter extends RecordWriter<NullWritable, MockWritable> {
	Logger logger = LoggerFactory.getLogger(MockRecordWriter.class);

	@Override
	public void write(NullWritable key, MockWritable value) throws IOException,
			InterruptedException {
		try {
			System.out.println("MockRecordWriter write");
			String dBDriver = value.getdBDriver();
			String connStr = value.getConnStr();
			String name = value.getName();
			String passwd = value.getPasswd();
			Class.forName(dBDriver);
			Connection conn = DriverManager.getConnection(connStr ,name ,passwd);
			System.out.println("conn " + conn);
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

	@Override
	public void close(TaskAttemptContext context) throws IOException,
			InterruptedException {
		
	}

}
