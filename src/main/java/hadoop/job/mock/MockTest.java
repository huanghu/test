package hadoop.job.mock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MockTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			String sDBDriver = "oracle.jdbc.driver.OracleDriver";
			String sConnStr = "jdbc:oracle:thin:@192.168.225.20:1528:SIT2";
			String name = "apps";
			String passwd = "appssit2";
			Class.forName(sDBDriver);
			Connection conn = DriverManager.getConnection(sConnStr ,name ,passwd);
			PreparedStatement ps = conn.prepareCall("{call MockCux('2013-08-01 00:00:00' ,'2013-09-01 00:00:00' ,'1111111' ,87149104 ,87174725 ,1)}");
			ps.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
