package io;

import java.io.FileReader;
import java.io.IOException;

public class BufferTest {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		try(FileReader fr = new FileReader("student.json");) {
			while(true) {
				int n = fr.read();
				if(n == -1) break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		System.out.println("----------------");
		startTime = System.nanoTime();
		
		try(FileReader fr = new FileReader("student.json");) {
			char[] buf = new char[1024];
			while(true) {
				int n = fr.read(buf);
				if(n == -1) break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		
		
	}

}





