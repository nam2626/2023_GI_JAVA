package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();

	private ArrayList<StudentVO> list;

	private StudentService() {
		list = new ArrayList<StudentVO>();
		loadStudentJSONFile();
//		list.add(new StudentVO("1111", "홍길동", "컴퓨터공학과", 3.1));
//		list.add(new StudentVO("2222", "김철수", "경영학과", 2.3));
//		list.add(new StudentVO("3333", "이기영", "생활체육학과", 4.2));
//		list.add(new StudentVO("4444", "박영수", "법학과", 1.5));
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

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentName().indexOf(name) != -1)
				result.add(list.get(i));
		}

		return result;
	}

	public ArrayList<String> getMajorList() {

		ArrayList<String> result = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			// 1. 학생 정보를 하나씩 뽑음
			// 2. 학과 정보를 뽑아서 리스트에 저장(중복이 안되게끔 처리)
			if (!result.contains(list.get(i).getMajor()))
				result.add(list.get(i).getMajor());
		}
		// 3. 결과를 리턴

		return result;
	}

	// 프로그램이 종료 직전 실행되는 메서드
	// 리스트에 있는 모든 데이터를 json으로 변경 후에
	// student.json으로 저장하게끔 처리
	public void saveStudentJSONFile() {
		// 1. 모든 데이터를 JSON으로 변환
		JSONArray array = new JSONArray(list);
		// 2. 텍스트 파일로 출력
		try (FileWriter fw = new FileWriter("student.json");) {
			fw.write(array.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// student.json 파일을 텍스트로 전부 읽어옴
	// 텍스트를 JSON으로 변환
	// JSONObject를 하나씩 읽어서 ArrayList에 추가
	public void loadStudentJSONFile() {
		// 1. 파일 읽기
		try (FileReader fr = new FileReader("student.json"); 
				BufferedReader br = new BufferedReader(fr);) {
			String str = "", s;
			while((s = br.readLine()) != null) {
				str += s;
			}
			// 2. JSONArray로 변경
			JSONArray jsonArray = new JSONArray(str);
			// 3. JSONObject로 한건 씩 읽어서 StudentVO 생성해서 list에 저장
			for(int i=0;i<jsonArray.length();i++) {
				JSONObject json = jsonArray.getJSONObject(i);
				list.add(new StudentVO(json.getString("studentNo"), 
						json.getString("studentName"),
						json.getString("major"),
						json.getDouble("score")));
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
