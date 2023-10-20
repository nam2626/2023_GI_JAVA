package static_ex;

public class Count {
	private int count;
	private static int total_count = 0;
	
	public Count() {
		count++;
		total_count++;
		System.out.println(count + " " + total_count);
	}
	
	public void addStaticCount() {
		//non-static에서는 static에 언제든지 접근이 가능
		//non-static이 실행되는 시점에는 static이 이미 메모리에 생성되어있다.
		total_count++;
	}
	
	
	
}





