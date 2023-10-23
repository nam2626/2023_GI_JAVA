package collection;

import java.util.ArrayList;

public class ListExample {
	/*
	 * 	List 특징
	 * 		1. 데이터 중복 O
	 * 		2. 리스트에 등록된 데이터 순서가 보장됨
	 * 
	 * 		ArrayList : 리스트에서 데이터를 배열로 관리
	 * 		LinkedList : 리스트에서 데이터를 노드 단위로 관리
	 */
	public static void main(String[] args) {
		//리스트 생성한 부분, <저장할 데이터 타입(참조형만 가능)>
		ArrayList<String> list = new ArrayList<String>();
		
		//데이터 추가
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("java");
		list.add("js/jQuery");
		list.add("jsp");
		list.add("jsp");
		
		System.out.println(list);
		
		//데이터 삭제 - 인덱스 번호로 삭제
		list.remove(1);
		System.out.println(list);
		
		//데이터 삭제 - 값을 기준으로 삭제, 1개만 삭제
		list.remove("jsp");
		System.out.println(list);
		
		//리스트에 저장된 데이터 개수
		System.out.println(list.size());
		
		//해당 인덱스의 데이터를 교체
		list.set(1, "C");
		System.out.println(list);
		
		//데이터를 원하는 인덱스 위치에 추가
		list.add(1, "C#");
		System.out.println(list);
		
		//데이터를 꺼내는 방법 - 1
		for(int i=0;i<list.size();i++) {
			//인덱스에 해당하는 값을 꺼냄
			System.out.println(list.get(i));
		}
		System.out.println("---------");
		//데이터를 꺼내는 방법 - 2
		for(String str : list) {
			System.out.println(str);
		}
		
		//해당 데이터가 리스트에 있냐?
		System.out.println(list.contains("자바"));
		System.out.println(list.contains("HTML/CSS"));
		
		//데이터가 몇번째에 위치해 있냐?
		System.out.println(list.indexOf("jsp"));
		System.out.println(list.indexOf("자바"));
		
		//리스트에 있는 모든 데이터를 삭제
		list.clear();
		System.out.println(list);
		
		//리스트가 비었냐?
		System.out.println(list.isEmpty());
	}

}












