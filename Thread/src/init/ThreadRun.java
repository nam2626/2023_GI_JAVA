package init;

public class ThreadRun extends Thread {
	
	public ThreadRun(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			//System.out.println(getName() + " - " + i + "번째 일");
		}
		System.out.println(getName()+" 종료");
	}
	
}
