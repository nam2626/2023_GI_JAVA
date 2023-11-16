package service;

import dao.StudentDAO;
import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();


	private StudentService() {

	}
	
	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	public boolean insertStudent(StudentVO studentVO) {
		int result = StudentDAO.getInstance().insertStudent(studentVO);
		return result == 1;
	}

}









