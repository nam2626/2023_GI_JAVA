package service;

import java.util.ArrayList;

import vo.EmployeeVO;

public class EmployeeService {
	private static EmployeeService instance = new  EmployeeService();
	private ArrayList<EmployeeVO> list;
	private EmployeeService() {
		list = new ArrayList<EmployeeVO>();
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
	
	
}





