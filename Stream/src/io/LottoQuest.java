package io;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;

public class LottoQuest {

	public static void main(String[] args) {
		Random r = new Random();
		String str = new String();
		
		str += String.format("%13s\n", "LOTTO");
		str += "----------------------\n";

		for(int i=0;i<5;i++) {
			HashSet<Integer> set = new HashSet<Integer>();
			while(set.size() < 6) {
				set.add(r.nextInt(45) + 1);
			}
			Object[] arr = set.toArray();
			str += "  ";
			for(Object obj : arr)
				str += String.format("%2d ", obj);
			str += "\n";
		}
		str += "----------------------\n";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		str += sdf.format(Calendar.getInstance().getTime());
		
		System.out.println(str);
		
		try(FileWriter fw = new FileWriter("lotto.txt");){
			fw.write(str);
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}







