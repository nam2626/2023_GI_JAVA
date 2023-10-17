package constructor;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "김철수";
		p1.age = 20;
		
		System.out.println(p1.name + " " + p1.age);
	}

}
