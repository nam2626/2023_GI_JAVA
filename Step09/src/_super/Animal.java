package _super;

public class Animal {
	protected int age;

	public Animal(int age) {
		this.age = age;
		System.out.println("Animal(int)");
	}
	
	public void printAge() {
		System.out.println("이 동물의 나이 : "+ age);
	}
}
