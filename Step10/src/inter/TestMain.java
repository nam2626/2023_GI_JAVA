package inter;

public class TestMain {
	public static void eat(Eat e) {
		e.eat();
	}
	
	public static void main(String[] args) {
		HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
		Dog dog = new Dog();
		Animal animal = new Animal();
		
		highSchoolStudent.eat();
		dog.eat();
		animal.eat(); 
		
		eat(highSchoolStudent);
		eat(dog);
		eat(animal);
	}
}







