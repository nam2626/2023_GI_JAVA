package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	/*
	 * 	Map
	 * 		키(Key) 값을 이용해서 데이터(Value)를 저장, 읽기, 삭제, 수정
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//데이터 추가
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 400);
		map.put("B", 500);//기존값을 지우고 새 값을 저장 - 똑같은 키 값이면 수정
		
		System.out.println(map);
		//데이터를 꺼낼때도 키값을 이용해서 꺼냄
		System.out.println(map.get("B"));
		System.out.println(map.get("F"));
		
		//삭제를 할 때도 키값으로 삭제
		map.remove("C");
		System.out.println(map);
		System.out.println(map.get("C"));
		
		//전체 데이터 꺼내기
		Set<String> key = map.keySet();
		
		//키값 전부 꺼내기
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println(k + " " + map.get(k));
		}
		
		//맵에 저장된 개수
		System.out.println(map.size());
		//맵에 해당하는 키값이 있는지? 키값 - A , C
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("C"));
		
		//맵에 해당하는 값이 있는지?
		System.out.println(map.containsValue(500));
		System.out.println(map.containsValue(600));
		
		//맵 내용 비우기
//		map.clear();
		System.out.println(map);
		//맵에 내용이 없냐?
		System.out.println(map.isEmpty());

 	}

}










