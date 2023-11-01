package lamda;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i=1;i<=100;i++)
					sum += i;
				System.out.println(sum);
			}
		});
		
		t1.start();
		//익명클래스 버전을 람다 바꾸어서 작성
		Thread t2 = new Thread(() -> {
			int sum = 0;
			for(int i=1;i<=100;i++)
				sum += i;
			System.out.println(sum);
		});
		t2.start();
	}

}






