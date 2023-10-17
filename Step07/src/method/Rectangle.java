package method;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return width * height;
	}
	
	int getCircumference() {
		return (width + height) * 2;
	}
}
