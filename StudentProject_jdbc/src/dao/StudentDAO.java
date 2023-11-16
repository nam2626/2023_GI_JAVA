package dao;

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
			
		return 0;
	}

	
}





