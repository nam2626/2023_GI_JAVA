package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest3 {

	public static void main(String[] args) {
		//학생 정보 1건 삽입하는 JDBC 작성
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn =
					DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			Statement stmt = conn.createStatement();
			String sql = "insert into student values('20231111','홍길동',2.1,'M',4)";
			int count = stmt.executeUpdate(sql);
			System.out.println(count);
			
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}







