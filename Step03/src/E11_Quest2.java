import java.util.Scanner;

public class E11_Quest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수 입력 : ");
		int score = sc.nextInt();

		if (score > 89)
			System.out.println("A");
		else if (score > 79)
			System.out.println("B");
		else if (score > 69)
			System.out.println("C");
		else if (score > 59)
			System.out.println("D");
		else
			System.out.println("F");

	}

}
