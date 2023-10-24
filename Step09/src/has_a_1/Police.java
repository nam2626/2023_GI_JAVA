package has_a_1;
/*
 * 경찰은 총을 상속 받아서
 * 경찰이 총을 쏘는 행위를 하면 총 클래스에 있는 shot를 호출하게끔 처리
 * 재장전 행위도 총 클래스에 있는 reload를 호출해서 처리
 * 경찰관은 수갑을 가지고 있게끔 처리, 수갑을 사용하는 메서드도 하나 작성
 */
public class Police extends Gun {
	private int handCuffs;

	public Police() {
		handCuffs = 3;
	}
	
	public void shot() {
		super.shot();
	}
	
	public void reload() {
		super.reload();
	}
	
	public void useHandCuffs() {
		if(handCuffs > 0) {
			System.out.println("수갑을 사용합니다.");
			handCuffs--;
		}else {
			System.out.println("더 이상 사용할 수갑이 없습니다.");
		}
	}
}








