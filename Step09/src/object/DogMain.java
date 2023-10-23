package object;

import java.util.ArrayList;

public class DogMain {

	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<Dog>();
		
		//리스트에 데이터 5개 저장 - 중복
		list.add(new Dog("리트리버", 2));
		list.add(new Dog("셰퍼트", 4));
		list.add(new Dog("푸들", 3));
		list.add(new Dog("비글", 3));
		list.add(new Dog("시츄", 1));
		
		Dog d = new Dog("푸들", 3);
		
		System.out.println(list.contains(d));
		System.out.println(list.indexOf(d));
		System.out.println(list.remove(d));
		System.out.println(list);
	}

}







