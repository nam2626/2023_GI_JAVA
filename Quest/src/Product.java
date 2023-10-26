
public class Product {
	private String name;
	private String maker;
	private String made;
	private int price;
	
	public Product(String name, String maker, String made, int price) {
		super();
		this.name = name;
		this.maker = maker;
		this.made = made;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", maker=" + maker + ", made=" + made + ", price=" + price + "]";
	}
	
	public void printInfo() {
		System.out.printf("%s %s %d %s\n",name,maker,price,made);
	}
}





