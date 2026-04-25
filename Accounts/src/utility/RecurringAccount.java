package utility;

public class RecurringAccount extends Account {
	
	static float interestRate;
	private double recurringAmount;
	private double noOfIntallments;
	
	static {
		interestRate = 7.2f;
	}

	public RecurringAccount() {
		super();
	}

	public RecurringAccount(int accno, String name, double balance, double recurringAmount, double noOfIntallments) {
		super(accno, name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calBalance() {
		balance = balance + (recurringAmount * noOfIntallments) + balance * (interestRate/100);
		return balance;
	}

	@Override
	public void withdraw(double money) {
		// TODO Auto-generated method stub
		
		System.out.println("Withdrawing MONEY NOT ALLOWED");
	}
	
	public String toString() {
		return super.toString() +"******Recurring AMount Balance Calculated:    "+ calBalance();
	}

}
