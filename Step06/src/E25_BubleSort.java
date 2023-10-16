
public class E25_BubleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 9, 3, 1 };
		
		for(int i=0;i<arr.length-1;i++) {
			//기준값이랑 뒤에값이랑 비교해서 큰값을 뒤로, 작은 값을 앞으로 저장(데이터 교환)
			for(int j=0;j < arr.length - 1 - i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			//출력
			for(int n : arr) {
				System.out.printf("%2d ",n);
			}
			System.out.println();
		}
	}

}


