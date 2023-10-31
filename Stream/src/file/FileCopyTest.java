package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		//1. 복사할 원본 파일을 스트림으로 연결 - A
		//2. 복사할 곳 파일을 스트림으로 연결 - B
		//3. A에서 데이터를 읽어오고, B에다가 출력 --> 3번과정을 반복해서 끝나면 파일 복사가 완료된 시점
		try(FileInputStream fis = new FileInputStream("image.jpg");
			FileOutputStream fos = new FileOutputStream("copy.jpg");){
			byte[] buffer = new byte[1024]; 
			while(true) {
				int n = fis.read(buffer);
				if(n == -1) break;
				fos.write(buffer); 
			}
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long endTime = System.nanoTime();
		System.out.println("완료 시간 : " + (endTime - startTime));
	}

}




