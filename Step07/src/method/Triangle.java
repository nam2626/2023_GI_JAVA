package method;

public class Triangle {
	int width;
	int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height / 2.0;
	}
	
}
