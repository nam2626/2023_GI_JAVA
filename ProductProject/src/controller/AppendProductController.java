package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class AppendProductController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품 정보 등록을 시작합니다........");
		System.out.print("제품번호 : ");
		String productNo = sc.nextLine();
		System.out.print("제품명 : ");
		String productName = sc.nextLine();
		System.out.print("제조사 : ");
		String maker = sc.nextLine();
		System.out.print("창고위치 : ");
		String warehouseLoc = sc.nextLine();
		System.out.print("재고 : ");
		int ea = sc.nextInt();
		sc.nextLine();

		boolean result = ProductService.getInstance().appendProduct(new ProductVO(productNo, productName, maker, ea, warehouseLoc));
		
		if(result)
			System.out.println("제품 등록 완료");
		else
			System.out.println("제품 등록 실패");
			
	}

}







