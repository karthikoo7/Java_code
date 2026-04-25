package utility;

	public abstract class Account {
	
	private int accno;
	private String name;
	protected double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
		this.name = "NA";		
	}

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ACC No:" + this.accno + " Name :" + this.name + " Your BALANCE : " + this.balance;
	}
	
	public abstract double calBalance();
	
	public abstract void withdraw(double money);
	

}
