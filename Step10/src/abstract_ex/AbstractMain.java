package abstract_ex;

public class AbstractMain {
	public static void main(String[] args) {
		//추상 클래스는 직접적으로 생성 X
//		Animal animal = new Animal();
		
		Person p = new Person();
		p.eat();
		p.run();
		
		//추상 클래스도 데이터 타입. 자식클래스를 형변환 시켜서 저장
		Animal animal = p;
		animal.eat();
		
		Dog d = new Dog();
		d.eat();
		d.run();
	}
}
