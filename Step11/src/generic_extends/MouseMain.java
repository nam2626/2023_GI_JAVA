package generic_extends;

public class MouseMain {

	public static void main(String[] args) {
		MouseHUB<GamingMouse> hub = new MouseHUB<GamingMouse>(new GamingMouse());
		hub.click(2);
//		Mouse 인터페이스를 받는 클래스만 선언할 수 있다.
//		MouseHUB<OfficeMouse> oHub;
	}

}
