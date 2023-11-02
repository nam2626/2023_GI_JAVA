package controller;

import java.util.Scanner;

import service.ProductService;

public class ProductToJSONController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품 정보 데이터를 json으로 변환합니다....");
		System.out.println(ProductService.getInstance().getJSONData());

	}

}
