package utility;

import java.io.Serializable;

public class Date implements Serializable {

	private int dd;
	private int mm;
	private int yy;
	
	public Date() {
		dd = 1;
		mm = 1;
		yy = 1970;
	}
	
	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public int getDd() { //getter
		return dd;
	}
	public void setDd(int d) { //setter
		this.dd = d;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int m) {
		this.mm = m;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int y) {
		this.yy = y;
	}
	
	
	public void display() {
		System.out.println(dd+"/"+ mm +"/"+ yy);
	}

	public boolean isLeapYear() {
		
		if(this.yy % 4 == 0 && this.yy % 100 != 0 || this.yy % 400 == 0) {
			
			return true;
		}
		 return false;
		
		
	}
	
	public void printLeap() {
		if(isLeapYear()) System.out.println("True");
		else
			System.out.println("False");
		
	}
	
	public String toString() { //method overriding of the implicit super class Object
		return " " + dd + "/" + mm + "/" + yy;
	}
}
