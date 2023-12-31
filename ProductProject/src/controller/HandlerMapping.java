package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		if (instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	public Controller createController(int no) {
		Controller controller = null;
		
		switch(no) {
		case 1:
			controller = new AppendProductController();
			break;
		case 2:
			controller = new SearchProductController();
			break;
		case 3:
			controller = new UpdateProductController();
			break;
		case 4:
			controller = new PrintAllProductController();
			break;
		case 5:
			controller = new ProductToJSONController();
			break;
			
		}
		
		return controller;
	}
}










