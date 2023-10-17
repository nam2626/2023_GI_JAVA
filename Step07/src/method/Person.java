package method;

/*
 * 	메서드는 클래스에서 기능을 담당하는 부분
 * 	
 * 	리턴타입 메서드명([매개변수].....){
 * 		
 * 		return 결과값; --> 리턴타입 void가 아닐때는 반드시 나와야 됨
 * 
 * 	}
 */

public class Person {
	//이름, 나이, 성별
	String name;
	int age;
	boolean gender;
	//전체 필드 초기화하는 생성자
	public Person(String name, int age, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//인적정보를 출력하는 기능 -> 이름 나이 남자/여자
	void printPersonInfo(){
		//true : 남자, false : 여자
		System.out.println(name + " " + age + " " + (gender ? "남자" : "여자"));
	}
	
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}





