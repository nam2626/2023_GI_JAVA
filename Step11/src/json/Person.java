package json;

import org.json.JSONPropertyIgnore;
import org.json.JSONPropertyName;

//이름 나이
//생성자 - 필드 초기화
//set/get 
public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	@JSONPropertyName("nm")
//	@JSONPropertyIgnore //JSON으로 변환할 데이터 대상에서 빼야될때
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
