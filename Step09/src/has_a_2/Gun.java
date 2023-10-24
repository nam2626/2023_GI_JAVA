package has_a_2;

public class Gun {
	//총알
	protected int bullet;
	//생성자 - 총알 12발 초기화

	public Gun() {
		bullet = 12;
	}
	
	//총을 쏘는 기능, 총알이 없으면 자동으로 재장전 시킴
	public void shot() {
		if(bullet == 0)
			reload();
		else {
			bullet--;
			System.out.println("BBang!!");
		}
	}
	
	//재장전 -> 총알을 전부 보충
	public void reload() {
		bullet = 12;
		System.out.println("reload!");
	}
}










