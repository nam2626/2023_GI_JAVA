package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

	public ArrayList<StudentVO> selectAllStudent() {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		
		String sql = "select s.std_no, s.std_name, s.std_score, m.major_name, s.gender "
				+ "from student s join major m on s.major_no = m.major_no";
		try {
			PreparedStatement pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String studentNo = rs.getString(1);
				String studentName = rs.getString(2);
				double score = rs.getDouble(3);
				String gender  = rs.getString(4);
				String majorName  = rs.getString(5);
				
				list.add(new StudentVO(studentNo, studentName, majorName, score, gender));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public StudentVO selectStudentNo(String studentNo) {
		StudentVO vo = null;
		
		String sql = "select s.std_no, s.std_name, s.std_score, m.major_name, s.gender "
				+ "from student s join major m on s.major_no = m.major_no"
				+ " where std_no like ?";
		try {
			PreparedStatement pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setString(1, studentNo);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String studentName = rs.getString(2);
				double score = rs.getDouble(3);
				String gender  = rs.getString(4);
				String majorName  = rs.getString(5);
				
				vo = new StudentVO(studentNo, studentName, majorName, score, gender);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return vo;
	}

	public ArrayList<StudentVO> selectStudentName(String name) {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		String sql = "select s.std_no, s.std_name, s.std_score, m.major_name, s.gender "
				+ "from student s join major m on s.major_no = m.major_no"
				+ " where std_name like '%' || ? || '%'";
		try {
			PreparedStatement pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String studentNo = rs.getString(1);
				String studentName = rs.getString(2);
				double score = rs.getDouble(3);
				String gender  = rs.getString(4);
				String majorName  = rs.getString(5);
				
				list.add(new StudentVO(studentNo, studentName, majorName, score, gender));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public int updateStudent(StudentVO vo) {
		String sql = "update student set std_name=?,std_score=?,gender=?,major_no=? "
				+ "where std_no like ?";
		int count = 0;
		try {
			PreparedStatement pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setString(1, vo.getStudentName());
			pstmt.setDouble(2, vo.getScore());
			pstmt.setString(3, vo.getGender());
			pstmt.setInt(4, vo.getMajorNo());
			pstmt.setString(5, vo.getStudentNo());
			
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}

	public int deleteStudent(String studentNo) {
		String sql = "delete from student where std_no like ?";
		int count = 0;
		try {
			PreparedStatement pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setString(1, studentNo);
			
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}

	
}










