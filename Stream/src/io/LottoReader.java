package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LottoReader {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("lotto.txt");){
			while(true) {
				int ch = fr.read();
				if(ch == -1) break;
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
