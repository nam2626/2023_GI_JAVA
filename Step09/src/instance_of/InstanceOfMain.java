package instance_of;

public class InstanceOfMain {

	public static void main(String[] args) {
		Person p = new Person();
		Animal a = p; // 자동으로 형변환, 작은개념이 큰개념이 되는 경우
		Person s = (Person) a;
//		Dog d = (Dog) a;
//		d.eat();
		
		// A instanceof B ---> 객체 A가 B클래스 타입으로 형변환이 되냐?
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Animal);
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Person);
		
		//클래스 이름 뽑아서 처리
		System.out.println(p.getClass().getName());
		System.out.println(p.getClass().getSimpleName());
		System.out.println(a.getClass().getName());
		System.out.println(Person.class.getName());
	}

}











