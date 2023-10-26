package service;

import java.util.ArrayList;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();

	private ArrayList<StudentVO> list;

	private StudentService() {
		list = new ArrayList<StudentVO>();
		list.add(new StudentVO("1111", "홍길동", "컴퓨터공학과", 3.1));
		list.add(new StudentVO("2222", "김철수", "경영학과", 2.3));
		list.add(new StudentVO("3333", "이기영", "생활체육학과", 4.2));
		list.add(new StudentVO("4444", "박영수", "법학과", 1.5));
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	public boolean appendStudent(StudentVO studentVO) {
		if (list.contains(studentVO))
			return false;
		list.add(studentVO);
		return true;
	}

	public ArrayList<StudentVO> getList() {
		return list;
	}

	public StudentVO searchStudentNo(String studentNo) {
		int i = list.indexOf(new StudentVO(studentNo, null, null, 0));
		return i > -1 ? list.get(i) : null;
	}

	public boolean deleteStudent(String studentNo) {
		return list.remove(new StudentVO(studentNo, null, null, 0));
	}

	public StudentVO topRankStudent() {
		for (int i = 0; i < list.size(); i++) {
			if (getRank(list.get(i).getScore()) == 1) {
				return list.get(i);
			}
		}
		return null;
	}

	public int getRank(double score) {
		int rank = 1;

		for (int i = 0; i < list.size(); i++) {
			if (score < list.get(i).getScore())
				rank++;
		}

		return rank;
	}

	public ArrayList<StudentVO> searchNameStudent(String name) {
		ArrayList<StudentVO> result = new ArrayList<StudentVO>();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getStudentName().indexOf(name) != -1)
				result.add(list.get(i));
		}
		
		return result;
	}

	public ArrayList<String> getMajorList() {
		
		ArrayList<String> result = new ArrayList<String>();
		
		for(int i=0;i<list.size();i++) {
			//1. 학생 정보를 하나씩 뽑음
			//2. 학과 정보를 뽑아서 리스트에 저장(중복이 안되게끔 처리)
			if(!result.contains(list.get(i).getMajor()))
				result.add(list.get(i).getMajor());
		}
		//3. 결과를 리턴
		
		return result;
	}

}















