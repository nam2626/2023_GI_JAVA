package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService;

public class PrintAllMajorController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("전체 학과 출력.....");
		ArrayList<String> list = StudentService.getInstance().getMajorList();
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
	}

}
