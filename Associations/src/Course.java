
public class Course {
	
	private String courseName;
	private Student [] sts;
	public Course() {
		this.courseName = "NA";
		//this.sts = new Student(); 
		
	}
	public Course(String courseName, Student[] sts) {
		//super();
		this.courseName = courseName;
		this.sts = sts;
	}
	
	public void display() {//fix it
		
		float maxPercent = 0;
		System.out.println(" Course Name  :" + courseName);
		if(sts != null) {
			for(Student s : sts) {
				
				if(maxPercent<s.percentage) {
					maxPercent = s.percentage;
				}
				s.display();
			}
		
		}
		/*
		if(sts != null) {
			for(Student s : sts) {
				
				if(maxPercent<s.percentage) {
					maxPercent = s.percentage;
				}
				s.display();
			}
			
			for(Student s : sts) {
				if(maxPercent == s.percentage) {
					System.out.println("Maximum Percentage student: ");
					s.display();
				}
			
		}
		*/
		
		}
		
		
	
	
	public Student topper() { //returns student type of object
		
		Student maxPercent = sts[0];
		
		for(Student s : sts) {
			if(s.percentage > maxPercent.percentage) {
				maxPercent.percentage = s.percentage;
			}
		}
		
		return maxPercent;
	}
	
	

}
	
