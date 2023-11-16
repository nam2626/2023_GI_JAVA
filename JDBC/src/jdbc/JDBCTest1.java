package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest1 {

	public static void main(String[] args) {
		try {
			//1. Driver Load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료");
			//2. DB Connect
			Connection conn =
					DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB접속 완료");
			//3. SQL Generate
			String sql = "select * from student";
			//4. Statement Create
			Statement stmt = conn.createStatement();
			//5. SQL Execute
			ResultSet rs = stmt.executeQuery(sql);
			//6. Result Print
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString("std_name") + " "
			+ rs.getInt(3) + " " + rs.getDouble("std_score"));
			}
			//7. close
			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}





