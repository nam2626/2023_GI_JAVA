package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			//1. 노드 스트림 초기화
			//저장할 파일경로, 추가모드
			fw = new FileWriter("hello.txt",true);
			//2. 프로세스 스트림 초기화
			pw = new PrintWriter(fw);
			//3. 출력
			pw.println("Hello World");
			pw.println("안녕하세요");
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//4. close
				if(pw != null)pw.close();
				if(fw != null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}





