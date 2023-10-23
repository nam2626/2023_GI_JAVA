package object;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//객체가 가지고 있는 정보나 값들을 문자열로 리턴하는 메서드
	//객체를 문자열 연산이나 출력시 자동으로 호출되는 메서드
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		//1. 메모리 주소가 같으면, 같은 객체
		if(this == obj) return true;
		//2. 받아온 obj가 현재 객체랑 비교할수 있는 타입인지 확인
		//   instanceof를 활용하거나, 클래스 객체가 제공하는 패키지명.클래스명이 동일한지 확인
		if(obj instanceof Person) {
			//3. 받아온 객체를 형변환
			Person temp = (Person) obj;
			//4. 내부에 있는 값을 비교해서 비교 결과를 리턴
			return name.equals(temp.name) && age == temp.age;
			
		}
		return false;
	}
	
	//객체를 식별하는 고유한 정수값을 반환하는 메서드
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
}








