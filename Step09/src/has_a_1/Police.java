package has_a_1;
/*
 * 경찰은 총을 상속 받아서
 * 경찰이 총을 쏘는 행위를 하면 총 클래스에 있는 shot를 호출하게끔 처리
 * 재장전 행위도 총 클래스에 있는 reload를 호출해서 처리
 * 경찰관은 수갑을 가지고 있게끔 처리, 수갑을 사용하는 메서드도 하나 작성
 */
//객체와 객체의 Has a 관계의 경우 이렇게 총과 경찰관의 사례보면
//경찰이 총기를 자유롭게 다양하게 교체해야되지만
//상속으로 표현하면 총기 하나에 귀속, 확장성 떨어지는 문제가 생김
//총기 교체할려면 코드를 수정해야 되는 문제가 생김
//이런 문제 때문에 Has a 관계를 표현 할때는 상속 구조로 표현하면 안됨
public class Police extends K2 {
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








