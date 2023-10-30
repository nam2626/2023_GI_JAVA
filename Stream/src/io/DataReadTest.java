package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataReadTest {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("data.dat"); 
				DataInputStream dis = new DataInputStream(fis);) {

			int n = dis.readInt();
			double pi = dis.readDouble();
			char ch = dis.readChar();
			boolean flag = dis.readBoolean();

			System.out.println(n + " " + pi + " " + ch + " " + flag);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
