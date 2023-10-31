package io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectQuest {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("person.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(new Person("김씨1", 20));
			oos.writeObject(new Person("김씨2", 30));
			oos.writeObject(new Person("김씨3", 40));
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("person.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			try {
				while (true) {
					Person p = (Person) ois.readObject();
					System.out.println(p);
				}
			} catch (EOFException e) {
				System.out.println("파일 읽기 종료");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
