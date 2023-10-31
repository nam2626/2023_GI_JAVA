package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadTest {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("person.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);){

			//Person 객체 하나 읽어와서 출력
			Person p = (Person) ois.readObject();
			
			System.out.println(p);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}






