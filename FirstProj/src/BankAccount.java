
public class BankAccount {
	
	private int accNo;
	private int balance;
	
	static float interestRate;
	
	static {
		interestRate = 7.25f;
	}
	
	public BankAccount(int accNo, int balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public static float updateInterestRate(float newRate) {
		
		return interestRate = newRate;
	}
	
	public double finalBalance() {
		return balance + balance * (interestRate/100);
	}
	
	
	public void display() {
		System.out.println("Interest Rate: "+ interestRate);
		System.out.println("Balence: "+ finalBalance());
	}

}
