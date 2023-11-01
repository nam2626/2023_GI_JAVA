package inner;

import inner.Outter.Inner;

public class OutterMain {

	public static void main(String[] args) {
		Outter out = new Outter(50);
		//Inner 클래스 생성 - 단 Outter 클래스가 생성이 되야 사용이 가능
		Inner inner1 = out.new Inner(100);
		inner1.printInner();
		Inner inner2 = out.new Inner(200);
		inner2.printInner();
		
		OutterStaticClass.InnerStaticClass in = new OutterStaticClass.InnerStaticClass(200);
		System.out.println(in.sum());
	}

}






