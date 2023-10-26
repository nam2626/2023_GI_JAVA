package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class PersonMain {

	public static void main(String[] args) {
		HashSet<Person> set1 = new HashSet<Person>();
		
		set1.add(new Person("김철수", 20));
		set1.add(new Person("홍길동", 30));
		set1.add(new Person("박문수", 40));
		set1.add(new Person("김철수", 20));
		System.out.println(set1);
		System.out.println("-------------");
		TreeSet<Person> set2 = new TreeSet<Person>();
		
		set2.add(new Person("김철수", 20));
		set2.add(new Person("홍길동", 30));
		set2.add(new Person("박문수", 40));
		set2.add(new Person("김철수", 20));
		System.out.println(set2);

		
		
	}

}
