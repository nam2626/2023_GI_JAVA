package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.DBManager;

public class JDBCTest5 {

	public static void main(String[] args) {

		try {
			String sql = "select * from car where car_price >= ?";
			Connection conn = DBManager.getInstance().getConn();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 5000);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " +rs.getString(2) + " " + rs.getInt(3)
				+ " " + rs.getInt(4) + " " + rs.getString(5));
			}
			DBManager.getInstance().close(rs, pstmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}

}








