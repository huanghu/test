package com.buy.test.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {
	private Connection conn;
	public Connection getJdintfErrConnection() throws SQLException, IOException{
		Connection connection;
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://192.168.232.62:3306/oozie60";
			String username = "oozie";
			String password = "oozie";
			Class.forName(driver);
			connection = DriverManager.getConnection(url ,username ,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new SQLException(e.getMessage());
		}
		conn = connection;
		return connection;
	}
	
	public boolean lotInfoLineExist(LotInfoLineDto infoLine) throws IOException{
		boolean result = false;
		if (conn == null) {
			return result;
		}
		
		try {
			String sql = "select count(*) from lot_info_line  where lot_num = ? and sku = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, infoLine.getLotNum());
			ps.setString(2, infoLine.getSku());
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int count = rs.getInt(1);
				if (count > 0) {
					result = true;					
				}
			}
			ps.close();
		} catch (SQLException e) {
			throw new IOException("抛出LotInfoLineExist SQLException异常" ,e);
		}
		return result;
	}

	public void insertLotInfoLine(LotInfoLineDto infoLine)
			throws IOException {
		if (conn == null) {
			throw new IOException("insertLotInfoLine connection is null");
		}
		
		try {
			//lot_num,sku,stock_quantity
			String sql = "insert into lot_info_line(lot_num,sku,stock_quantity,creation_time,update_time) value" +
			"(? ,? ,? ,now() ,now())";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, infoLine.getLotNum());
			ps.setString(2, infoLine.getSku());
			ps.setString(3, infoLine.getStockQuantity());
			
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			throw new IOException("抛出insertLotInfo SQLException异常" ,e);
		}
	}

	public void updateLotInfoLine(LotInfoLineDto infoLine) throws IOException {
		if (conn == null) {
			throw new IOException("updateLotInfoLine connection is null");
		}
		
		try {
			//stock_quantity + ? where lot_num = ? and sku = ?
			String sql = "update lot_info_line set stock_quantity = stock_quantity + ? where lot_num = ? and sku = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, infoLine.getStockQuantity());
			ps.setString(2, infoLine.getLotNum());
			ps.setString(3, infoLine.getSku());
			
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			throw new IOException("抛出insertLotInfo SQLException异常" ,e);
		}	
	}
}
