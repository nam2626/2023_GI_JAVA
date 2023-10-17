package field;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.studentNo = "201011111";
		std1.studentName = "홍길동";
		std1.birth = "1999-08-15";
		std1.gender = true;
		std1.major = "경영학과";
		std1.score = 3.14;
		std1.profileImgUrl = "https://img.student.com/20101111";
		
		System.out.println(std1.studentNo);
		System.out.println(std1.studentName);
		System.out.println(std1.birth);
		System.out.println(std1.gender);
		System.out.println(std1.major);
		System.out.println(std1.score);
		System.out.println(std1.profileImgUrl);
	}

}




