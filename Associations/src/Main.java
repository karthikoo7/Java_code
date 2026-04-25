
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student [] sts = {
				new Student(22,"Karthik",88.2f),
				new Student(42,"Pathaan",90.2f),
				new Student(72,"Don",82.2f)
		};
		
		Course p1 = new Course ();
		p1.display();
		
		Course c2 = new Course("DBDA",sts);
		c2.display();
		
		System.out.println("******************************");
		
		Student s = c2.topper();
		
		s.display();
		

	}

}
