package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("person.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			Person p = new Person("홍길동", 20);
			
			//p를 파일로 출력
			oos.writeObject(p);
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}






