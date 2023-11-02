package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class SearchProductController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품 정보 조회를 시작합니다............");
		System.out.print("조회할 제품 번호 입력 > ");
		String productNo = sc.nextLine();
		
		ProductVO vo = ProductService.getInstance().searchProduct(productNo);
		
		if(vo == null)
			System.out.println("검색 결과가 없습니다.");
		else
			vo.printProductInfo();
	}

}








