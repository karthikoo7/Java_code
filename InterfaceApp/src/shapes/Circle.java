package shapes;

public class Circle implements Drawable {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle......");

	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
	
		return PI * radius*radius;

	}

}
