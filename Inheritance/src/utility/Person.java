package utility;

import java.io.Serializable;

public class Person implements Serializable {
	
	String name;
	Date bdate; //declared object
	public Person() {
		//super();
		// TODO Auto-generated constructor stub
		this.name = "NA";
		this.bdate = new Date(); //Initialising object
		
	}
	public Person(String name, Date bdate) {
		//super();
		this.name = name;
		this.bdate = bdate;
	}
	
	public Person(String name, int d, int m , int y) {
		this.name = name;
		this.bdate = new Date(d,m,y);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void display() {
		System.out.println("NAME= " + name);
		if(bdate!=null) {
		bdate.display();
		}
	}
	
	public String toString() {
		return "Name: " + this.name + bdate;
	}
}
