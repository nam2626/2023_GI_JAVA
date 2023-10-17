package method;

public class PolygonMain {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(7, 5);
		System.out.println(triangle.getArea());
		
		Rectangle rect = new Rectangle(4, 6);
		System.out.println(rect.getArea());
		System.out.println(rect.getCircumference());
		
		Circle circle = new Circle(5);
		System.out.println(circle.getArea());
		System.out.println(circle.getCircumference());
		
	}

}
