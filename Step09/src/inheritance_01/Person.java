package inheritance_01;

public class Person extends Animal {
	
	public Person() {
		System.out.println("Person 생성자");
	}
	//나이 출력하는 메서드
	public void printAge() {
		System.out.println("나이 : "+age);
	}
	
	public void run() {
		System.out.println("사람이 달립니다.");
	}
	//오버라이딩(재정의) : 재구현(메서드명이 동일, 매개변수도 동일, 접근 제어자도 동일, 리턴타입 동일)
	public void eat() {
		System.out.println("사람이 밥을 먹습니다.");
	}
}
