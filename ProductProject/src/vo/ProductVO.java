package vo;

import java.util.Objects;

public class ProductVO {
	private String productNo;
	private String productName;
	private String maker;
	private int ea;
	private String warehouseLoc;

	public ProductVO(String productNo, String productName, String maker, int ea, String warehouseLoc) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.maker = maker;
		this.ea = ea;
		this.warehouseLoc = warehouseLoc;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public String getWarehouseLoc() {
		return warehouseLoc;
	}

	public void setWarehouseLoc(String warehouseLoc) {
		this.warehouseLoc = warehouseLoc;
	}

	@Override
	public String toString() {
		return "ProductVO [productNo=" + productNo + ", productName=" + productName + ", maker=" + maker + ", ea=" + ea
				+ ", warehouseLoc=" + warehouseLoc + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ProductVO))
			return false;
		ProductVO other = (ProductVO) obj;
		return Objects.equals(productNo, other.productNo);
	}

	public void printProductInfo() {
		System.out.printf("%s %s %s %d %s\n", productNo, productName, maker, ea, warehouseLoc);
	}
}
