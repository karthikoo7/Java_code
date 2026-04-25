package staff;

public class Admin extends Emp {
	
	private double allowance;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, int d, int m, int y, int empId, double salary, double allowance) {
		super(name, d, m, y, empId, salary);
		this.allowance = allowance;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("ALLOWANCE : " + allowance);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "ALLOWANCE : " + allowance;
	}
	
	public double calSalary() {
		return salary + allowance; // salary - protected access specifier
	}
	
	public double callAllowance() {
		return allowance;
	}
	
	

}
