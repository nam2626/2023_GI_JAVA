package generic;

public class BoxMain {

	public static void main(String[] args) {
		Box box = new Box();

		box.setObj(200);
		System.out.println(box.getObj());

		// Object로 저장하면 어떤 타입이든지 될 수 있어서
		// 사용할 때는 반드시 형변환 부분이 필요하다
		box.setObj(new Apple());
		((Apple) box.getObj()).printApple();
		
		if(box.getObj() instanceof Orange)
			((Orange) box.getObj()).printOrange();
	}

}
