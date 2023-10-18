package ex;

public class CalcuratorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.sum(10, 20));
		System.out.println(cal.sum(3.1415, 222));
		
		for(int i=0;i<100;i++) {
			if(cal.checkPrimeNumber(i))
				System.out.print(i + " ");
		}
		System.out.println();
	}

}
