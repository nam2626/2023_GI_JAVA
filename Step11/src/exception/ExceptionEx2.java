package exception;

public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			int[] arr = null;
//			arr[0] = 100;
			System.out.println(2);
			arr = new int[5];
			arr[5] = 100 / 2;
			System.out.println(3);
		} catch (NullPointerException e) {
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(5);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(6);
		} catch (Exception e) {
			System.out.println(7);
		}
		System.out.println("end");
	}
}


