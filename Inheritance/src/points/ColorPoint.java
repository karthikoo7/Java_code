package points;

public class ColorPoint extends Point {
	
	private String color;

	
	
	public ColorPoint() {
		super();
		// TODO Auto-generated constructor stub
		this.color = "NA";
	}

	public ColorPoint(String color,int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	
	public void display() {
		super.display();
		System.out.println("Color : " + this.color);
		
	}

}
