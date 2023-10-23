package object;

import java.util.Objects;

public class Dog {
	//품종
	//나이
	private String breed;
	private int age;
	//생성자 - 전체 필드 초기화
	public Dog(String breed, int age) {
		super();
		this.breed = breed;
		this.age = age;
	}
	//toString
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", age=" + age + "]";
	}
	//equals
	@Override
	public int hashCode() {
		System.out.println("hashCode 호출");
		return Objects.hash(age, breed);
	}
	//hashCode
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals 호출");
		if (this == obj)
			return true;
		if (!(obj instanceof Dog))
			return false;
		Dog other = (Dog) obj;
		return age == other.age && Objects.equals(breed, other.breed);
	}
	
	
}






