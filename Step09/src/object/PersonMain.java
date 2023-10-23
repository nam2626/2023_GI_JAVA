package object;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 22);
	
		System.out.println(p);
		System.out.println(Integer.toHexString(System.identityHashCode(p)));
		
		Person s = new Person("홍길동", 22);
		System.out.println(p == s);//메모리 주소
		System.out.println(p.equals(s));
		
		System.out.println(s.hashCode());
		System.out.println(p.hashCode());
		
	}

}
