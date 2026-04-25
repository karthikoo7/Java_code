package staff;
 
import utility.Itraveller;

public class Programmer extends Emp implements Itraveller {
	
	private String projectTitle;
	private int extraHours;
	private double chargePerExtraHour;
	private int daysTravelled;
	private String passNum;
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
		this.projectTitle = "NA";
	}

	public Programmer(String name, int d, int m, int y, int empId, double salary, String projectTitle, int extraHours,
			int chargePerExtraHour, int daysTravelled, String passNum) {
		super(name, d, m, y, empId, salary);
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargePerExtraHour = chargePerExtraHour;
		this.daysTravelled = daysTravelled;
		this.passNum = passNum;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("PROJ TITLE : " + projectTitle + " EXTRS HOUR : " + extraHours + " CHARGE PER EXTRA HOUR : " + chargePerExtraHour);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "PROJ TITLE : " + projectTitle + " EXTRS HOUR : " + extraHours + " CHARGE PER EXTRA HOUR : " + chargePerExtraHour;
	}
	
	public double calSalary() {
		
		return salary + calExtraCharges()+calculateTA(); // salary data memeber protected not private
	}
	
	public double calExtraCharges() {
		return this.extraHours * this.chargePerExtraHour;
		
	}

	@Override
	public double calculateTA() {
		// TODO Auto-generated method stub
		return daysTravelled * (salary * TA);
	}

	@Override
	public String getPassportDetails() {
		// TODO Auto-generated method stub
		return "NAME : " + getName() +"PASS NUM : " + this.passNum;
	}

	@Override
	public int getTravelHours() {
		// TODO Auto-generated method stub
		return this.daysTravelled * 24;
	}
	

	
	

}
