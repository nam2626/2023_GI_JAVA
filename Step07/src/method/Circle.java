package method;

public class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	double getCircumference() {
		return 2 * radius * Math.PI;
	}
}
