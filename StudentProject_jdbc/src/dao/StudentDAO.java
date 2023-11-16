package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.DBManager;
import vo.StudentVO;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();

	private StudentDAO() {

	}

	public static StudentDAO getInstance() {
		if(instance == null)
			instance = new StudentDAO();
		return instance;
	}

	public int insertStudent(StudentVO studentVO) {
		//student 테이블에 데이터 등록하는 부분 추가
		String sql = "insert into student values(?,?,?,?,?)";
		int count = 0;
		try {
			PreparedStatement pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setString(1, studentVO.getStudentNo());
			pstmt.setString(2, studentVO.getStudentName());
			pstmt.setDouble(3, studentVO.getScore());
			pstmt.setString(4, studentVO.getGender());
			pstmt.setInt(5, studentVO.getMajorNo());
			
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}

	
}










