//Assocoation
public class Person {
	
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
	
	public void display() {
		System.out.println("NAme= " + name);
		if(bdate!=null) {
		bdate.display();
		}
	}
	
	
	
	

}
