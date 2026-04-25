package shapes;

public class Rectangle implements Drawable {
	private double length;
	private double breadth;
	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");

	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

}
