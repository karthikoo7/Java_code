package apps;

import myExceptions.InvalidColorException;

public class Color {
	
	private int r,g,b;

	public Color() {
		// TODO Auto-generated constructor stub
	}

	public Color(int r, int g, int b) throws InvalidColorException {
		if(r >=0 && r <= 255) {
		this.r = r;
		}
		else {
			throw new InvalidColorException();
		}
		if(g >=0 && g <= 255) {
		this.g = g;
		}
		else {
			throw new InvalidColorException();
		}
		
		if(b >=0 && b <= 255) {
		this.b = b;
		}
		else {
			throw new InvalidColorException();
		}
	}
	
	public String toString() {
		String color = "";
		
		if(g == 0 && b == 0 && r == 255) {
			return color = "red";
		}
		else if(r == 0 && g == 0 && b == 255) {
			return color = "blue";
		}
		else if( r == 0 && b == 0 && g == 255) {
			return color = "green";
		}
		else if( r == 0 && g == 0 && b == 0) {
			return color = "black";
		}
		else if( r == 255 && g == 255 && b == 255) {
			return color = "white";
		}
		else {
			return color = "RGB Shade";
		}
		
		
		
		
	}
	
	
	

}
