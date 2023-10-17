package constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student("22222","홍길동","경영학과",3.14);
		System.out.println(std1.studentNo);
		System.out.println(std1.name);
		System.out.println(std1.major);
		System.out.println(std1.score);
		System.out.println(std1);
		
		Student[] arr = new Student[10];
		
	}

}
