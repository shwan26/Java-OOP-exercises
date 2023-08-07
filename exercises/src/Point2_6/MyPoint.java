package Point2_6;

public class MyPoint {
	private int x;
	private int y;
	private int[] XY = {x,y};
	
	public MyPoint() {
		
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		return XY;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
		XY[0] = x;
		XY[1] = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public double distance(int x, int y) {
		int xDiff = this.x-x;
		int yDiff = this.y-y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance(MyPoint another) {
		int xDiff = this.x-another.x;
		int yDiff = this.y-another.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance() {
		int xDiff = this.x-0;
		int yDiff = this.y-0;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
}
