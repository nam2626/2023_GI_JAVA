
public class E26_SelectSort {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 9, 3, 1 };
		
		for(int i=0;i<arr.length-1;i++) {
			int minIdx = i;
			for(int j=i+1;j < arr.length;j++) {
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
			//출력
			for(int n : arr) {
				System.out.printf("%2d ",n);
			}
			System.out.println();
		}
	}
}
