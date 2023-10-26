package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	/*
	 * 	Set
	 * 		1. 데이터를 중복해서 저장 X
	 * 		2. 자동 정렬
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		//데이터 등록
		set.add("HTML/CSS");
		set.add("js/jQuery");
		set.add("JAVA");
		set.add("Spring");
		set.add("js/jQuery");
		set.add("Android");
		set.add("JAVA");
		
		System.out.println(set);
		
		//데이터 삭제
		set.remove("JAVA");
		System.out.println(set);
		System.out.println(set.remove("Spring"));
		
		//데이터 개수 체크
		System.out.println(set.size());
		//데이터 검색 - 있는지 체크
		System.out.println(set.contains("Android"));
		
		//set이 비었냐?
//		set.clear();
		System.out.println(set.isEmpty());
		
		//전체 조회 1 - 배열로 변환해서 조회
		String[] arr = new String[set.size()];
		set.toArray(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

		System.out.println("------------------");
		//전체 조회 2 - 반복자(Iterator)
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {//다음 위치에 값이 있냐?
			System.out.println(it.next());//다음 위치로 이동해서 값을 리턴 
		}

		
	}
}















