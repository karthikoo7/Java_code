
public class Student {
	private int sid;
	private String sname;
	float percentage;
	public Student() {
		//super();
		// TODO Auto-generated constructor stub
		this.sid = 0;
		this.sname = "";
		this.percentage = 0.0f;
	}
	public Student(int sid, String sname, float percentage) {
		//super();
		this.sid = sid;
		this.sname = sname;
		this.percentage = percentage;
	}
	
	
	
	public void display() {
		System.out.println("ID: " + sid + " Name: " + sname + " Percentage : " + percentage);
	}
	
	
}
