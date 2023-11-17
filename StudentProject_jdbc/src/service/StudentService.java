package service;

import java.util.ArrayList;
import java.util.TreeMap;

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

	public ArrayList<StudentVO> selectAllStudent() {
		return StudentDAO.getInstance().selectAllStudent();
	}

	public StudentVO selectStudentNo(String studentNo) {
		return StudentDAO.getInstance().selectStudentNo(studentNo);
	}

	public ArrayList<StudentVO> selectStudentName(String name) {
		return StudentDAO.getInstance().selectStudentName(name);
	}

	public int updateStudent(StudentVO vo) {
		return StudentDAO.getInstance().updateStudent(vo);
	}

	public boolean deleteStudent(String studentNo) {
		return StudentDAO.getInstance().deleteStudent(studentNo) == 1;
	}

	public TreeMap<Integer, ArrayList<StudentVO>> topRankStudent() {
		return StudentDAO.getInstance().topRankStudent();
	}

}









