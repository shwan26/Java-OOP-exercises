package line_point2_7;

public class TestLine {

	public static void main(String[] args) {
		
		//MyPoint
		MyPoint p1 = new MyPoint(3, 4);
		System.out.println(p1);

		MyPoint p2 = new MyPoint(7, 4);  // Test another constructor
		System.out.println(p2);
		
		
		//MyLine
		MyLine line1 = new MyLine(p1,p2);
		System.out.println("Gradient: "+line1.getGradient());
		System.out.println("Length: "+line1.getLength());
		
		
		
	}

}
