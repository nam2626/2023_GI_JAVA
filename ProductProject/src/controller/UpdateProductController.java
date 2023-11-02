package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class UpdateProductController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품 정보 수정을 시작합니다............");
		System.out.print("수정할 제품 번호 입력 > ");
		String productNo = sc.nextLine();
		
		ProductVO vo = ProductService.getInstance().searchProduct(productNo);
		
		if(vo == null) {
			System.out.println("수정할 데이터가 없습니다.");
			return;
		}
		System.out.print("수정할 제품명 : ");
		String productName = sc.nextLine();
		System.out.print("수정할 제조사 : ");
		String maker = sc.nextLine();
		System.out.print("수정할 창고위치 : ");
		String warehouseLoc = sc.nextLine();
		System.out.print("수정할 재고 : ");
		int ea = sc.nextInt();
		sc.nextLine();
		vo.setProductName(productName);
		vo.setMaker(maker);
		vo.setEa(ea);
		vo.setWarehouseLoc(warehouseLoc);
		
		System.out.println("해당 데이터 수정을 완료하였습니다.");
		
	}

}







