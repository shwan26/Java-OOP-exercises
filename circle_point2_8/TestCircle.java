package circle_point2_8;

public class TestCircle {

	public static void main(String[] args) {
		
		//MyPoint
		MyPoint p1 = new MyPoint(3, 4);
		System.out.println(p1);

		MyPoint p2 = new MyPoint(7, 4);  // Test another constructor
		System.out.println(p2);
		
		
		//MyCircle
		MyCircle circle1 = new MyCircle(p1,4);
		System.out.println(circle1.toString());
		System.out.println("Area of Circle: "+circle1.getArea());
		System.out.println("Circumference of Circle: "+circle1.getCircumference());
		
		
		
	}

}
