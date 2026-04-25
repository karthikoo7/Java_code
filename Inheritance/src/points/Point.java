package points;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	
	}
	
	public void setVal(int x,int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public void display() {
		System.out.println( "OUTPUT : " + "["+ this.x +","+  this.y + "]");
	}
	
	public int getQuadrant() {
		
		if(x == 0 && y==0) {
			return 0;
		}
		else if(x>0 && y>0) {
			return 1;
		}
		else if(x<0 && y>=0) {
			return 2;
		}
		else if(x<0 && y<0) {
			return 3;
		}
		else if(x>=0 && y<0) {
			return 4;
		}
		
		return 5;
	}

}
