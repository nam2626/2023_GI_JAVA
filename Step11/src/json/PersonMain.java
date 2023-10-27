package json;

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
		
		System.out.println(jObj1.toString());
	}

}
