package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}
	
	public Controller createController(int no) {
		Controller controller = null;
		switch(no) {
		case 1:
			controller = new AppendEmployeeController();
			break;
		case 2:
			controller = new DeleteEmployeeController();
			break;
		case 3:
			controller = new UpdateEmployeeController();
			break;
		case 4:
			controller = new SearchEmployeeController();
			break;
		case 5:
			controller = new PrintAllEmployeeController();
			break;
		case 6:
			controller = new JSONEmployeeController();
			break;
		}
		return controller;
	}
	
}








