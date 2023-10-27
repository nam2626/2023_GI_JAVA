package json;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class PersonMain {

	public static void main(String[] args) {
		//Person 객체 3개 생성
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("김철수", 33);
		Person p3 = new Person("이영희", 44);
		
		JSONObject jObj1 = new JSONObject();
		jObj1.put("name", p1.getName());
		jObj1.put("age", p1.getAge());
		
		JSONObject jObj2 = new JSONObject();
		jObj2.put("name", p2.getName());
		jObj2.put("age", p2.getAge());
		
		JSONObject jObj3 = new JSONObject();
		jObj3.put("name", p3.getName());
		jObj3.put("age", p3.getAge());
		
		System.out.println(jObj1.toString());
		System.out.println(jObj2.toString());
		System.out.println(jObj3.toString());
		
		JSONArray arr = new JSONArray();
		arr.put(jObj1);
		arr.put(jObj2);
		arr.put(jObj3);
		
		System.out.println(arr.toString());
		
		//----------------------
		JSONObject j1 = new JSONObject(p1);
		JSONObject j2 = new JSONObject(p2);
		JSONObject j3 = new JSONObject(p3);
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		
		//ArrayList 작성 <--- p1,p2,p3 다 저장
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		JSONArray arr1 = new JSONArray(list);
		System.out.println(arr1.toString());
		
	}

}
















