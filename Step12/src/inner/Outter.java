package inner;

public class Outter {
	private int outter;

	public Outter(int outter) {
		super();
		this.outter = outter;
	}
	
	public void printOutter() {
		System.out.println("outter : "+outter);
	}
	
	public class Inner{
		private int inner;

		public Inner(int inner) {
			this.inner = inner;
		}
		
		public int sum() {
			return outter + inner;
		}
		
		public void printInner() {
			System.out.println(outter + " -> " + inner);
		}
	}
}





