package service;

import java.util.ArrayList;

import org.json.JSONArray;

import vo.ProductVO;

public class ProductService {
	private static ProductService instance = new ProductService();

	private ArrayList<ProductVO> list;
	private ProductService() {
		list = new ArrayList<ProductVO>();
		list.add(new ProductVO("AA001", "갤럭시S23", "삼성", 22, "제2창고"));
		list.add(new ProductVO("AA002", "갤럭시S23U", "삼성", 32, "제2창고"));
		list.add(new ProductVO("AA003", "아이폰15Pro", "애플", 40, "제1창고"));
	}

	public static ProductService getInstance() {
		if (instance == null)
			instance = new ProductService();
		return instance;
	}

	public boolean appendProduct(ProductVO productVO) {
		if(list.indexOf(productVO) != -1)
			return false;
		list.add(productVO);
		return true;
	}

	public ArrayList<ProductVO> getList() {
		return list;
	}

	public ProductVO searchProduct(String productNo) {
		int idx = list.indexOf(new ProductVO(productNo, null, null, 0, null));
		if(idx == -1)
			return null;
		return list.get(idx);
	}

	public String getJSONData() {
		JSONArray arr = new JSONArray(list);
		return arr.toString();
	}

}






