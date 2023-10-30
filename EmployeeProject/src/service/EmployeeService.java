package service;

import java.util.ArrayList;

import org.json.JSONArray;

import vo.EmployeeVO;

public class EmployeeService {
	private static EmployeeService instance = new  EmployeeService();
	private ArrayList<EmployeeVO> list;
	private EmployeeService() {
		list = new ArrayList<EmployeeVO>();
		
		list.add(new EmployeeVO("1111", "홍길동", 2300, "영업부"));
		list.add(new EmployeeVO("2222", "김철수", 3300, "회계부"));
		list.add(new EmployeeVO("3333", "이영희", 4200, "총무부"));
	}

	public static EmployeeService getInstance() {
		if(instance == null)
			instance = new EmployeeService();
		return instance;
	}

	public boolean appendEmplyee(EmployeeVO employeeVO) {
		if(list.contains(employeeVO))
			return false;
		list.add(employeeVO);
		return true;
	}

	public ArrayList<EmployeeVO> getList() {
		return list;
	}

	public EmployeeVO searchEmployee(String employeeNo) {
		int index = list.indexOf(new EmployeeVO(employeeNo, null, 0, null)); 
		return index == -1 ? null : list.get(index);
	}

	public boolean deleteEmployee(String employeeNo) {
		return list.remove(new EmployeeVO(employeeNo, null, 0, null));
	}

	public String employeeToJson() {
		JSONArray arr = new JSONArray(list);
		return arr.toString();
	}
	
	
}





