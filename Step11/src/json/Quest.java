package json;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class Quest {
	public static void jsonParse(String str) {
		JSONObject json = new JSONObject(str);
		
		System.out.println(json.get("size"));
		//Person 데이터 전부 출력
		JSONArray arr = json.getJSONArray("arr");
		for(int i=0;i<arr.length();i++) {
			JSONObject j = arr.getJSONObject(i);
			System.out.println(j.get("name") + " " + j.get("age"));
		}
	}
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동", 20));
		list.add(new Person("김철수", 33));
		list.add(new Person("이영희", 44));
		
		JSONObject json = new JSONObject();
		json.put("size", list.size());
		json.put("arr", list);
		
		System.out.println(json.toString());
		jsonParse(json.toString());
	}

}







