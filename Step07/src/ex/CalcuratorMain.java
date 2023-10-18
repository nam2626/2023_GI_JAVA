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
		
		int[] arr = {1,2,4,5,6,2,5,6,22};
		System.out.println(cal.avgArray(arr));
		
		System.out.println(cal.avgArray2(1,2,3,4,5,6));
		System.out.println(cal.avgArray2(1,2,3,4,5));
	}

}





