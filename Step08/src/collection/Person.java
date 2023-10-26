package collection;

import java.util.Objects;

public class Person implements Comparable<Person>{
	//이름 나이
	private String name;
	private int age;
	//생성자로 필드 초기화
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	//hashCode
	@Override
	public int hashCode() {
		System.out.println("Person hashCode - "+Objects.hash(age, name));
		return Objects.hash(age, name);
	}
	//equals
	@Override
	public boolean equals(Object obj) {
		System.out.println("Person equals");
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	//기준값이랑 비교값이 같으면 0
	//기준값 - 비교값 ---> 음수, 양수, 비교값 > 기준값, 비교값 < 기준값 
	@Override
	public int compareTo(Person o) {
		if(equals(o)) {
			return 0;
		}else if(hashCode() > o.hashCode()) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
}





