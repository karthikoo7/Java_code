
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Date d1 = new Date();
		d1.display();
		
		Date d2 = new Date(2,2,2005);
		d2.display();
		d2.setDd(9);
		d2.setMm(12);
		d2.setYy(1996);
		d2.display();
		
		d2.printLeap();
*/
		
		Person p1 = new Person();
		p1.display();
		
		Person p2 = new Person("Karthik", 20, 30, 2004);
		p2.display();
		
		Date d = new Date(22,12,1999);
		
		Person p3 = new Person("Don" , d);
		p3.display();
		
		
		
		
	}

}
