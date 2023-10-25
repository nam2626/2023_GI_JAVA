package final_ex;

public class Animal {
	//클래스에 final 키워드가 붙어있으면 해당 클래스를 상속 받을수가 없다.
//	public final class Animal {
	private final int age;//이렇게 final을 쓸 경우에는 반드시 생성자에서 초기화가 필요
	
	public Animal(int age) {
		super();
		this.age = age;
	}

	//final 키워드가 붙은 메서드는 오버라이딩을 금지 시킨다.
	public final void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
}
