package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotePad {
	/*
	 * 파일명을 사용자로부터 입력 받아서 파일을 생성을 한 후 사용자로부터 문자열을 입력 받아서 입력 받은 내용을 생성한 파일에 출력. 단
	 * exit라는 단어를 입력하면 사용자로부터 입력 종료 오픈한 파일 역시 close 작업을 수행
	 * 
	 * FileWriter, PrintWriter, Scanner
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		// 파일 생성
		// 스트림 생성 및 초기화
		try (FileWriter fw = new FileWriter(fileName);
				PrintWriter pw = new PrintWriter(fw);) {
			while (true) {
				String str = sc.nextLine();
				if (str.equals("exit"))
					break;
				// 파일 출력
				pw.println(str);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}



