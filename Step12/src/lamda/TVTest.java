package lamda;

public class TVTest {

	public static void main(String[] args) {
		//TV 객체 생성
		TV tv1 = new TV(new Power() {
			
			@Override
			public void powerOnOff() {
				//tv.pow TV가 가지고있는 private 필드는 사용 못함.
			}
		});
		
		TV tv2 = new TV(() -> {
			//tv.pow TV가 가지고있는 private 필드는 사용 못함.
		});
		
	}

}
