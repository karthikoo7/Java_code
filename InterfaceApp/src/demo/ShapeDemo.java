package demo;

import shapes.*;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Drawable [] shapes = {
			new Circle(5),
			new Rectangle(10,5)
		};
		
		for(Drawable a : shapes) {
			a.drawShape();
			System.out.println(a.calArea());
		}
		

	}

}
