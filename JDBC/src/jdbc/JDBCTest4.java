package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest4 {

	public static void main(String[] args) {
		//학생 정보 1건 삽입하는 JDBC 작성
		//학생 정보를 직접 입력 받은 값으로 삽입
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn =
					DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("학번 입력 : ");
			String stdNo = sc.nextLine();
			System.out.print("이름 입력 : ");
			String stdName = sc.nextLine();
			System.out.print("평점 입력 : ");
			double score = sc.nextDouble(); sc.nextLine();
			System.out.print("성별 입력 : ");
			String gender = sc.nextLine();
			System.out.print("학과번호 입력 : ");
			int major = sc.nextInt(); sc.nextLine();
						
			String sql = "insert into student values(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stdNo);
			pstmt.setString(2, stdName);
			pstmt.setDouble(3, score);
			pstmt.setString(4, gender);
			pstmt.setInt(5, major);
			int count = pstmt.executeUpdate();
			System.out.println(count);
			
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
