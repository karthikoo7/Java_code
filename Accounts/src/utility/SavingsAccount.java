package utility;

public class SavingsAccount extends Account {
	
	static float interestRate;
	
	static {
		interestRate = 4.5f;
	}

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int accno, String name, double balance) {
		super(accno, name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calBalance() {
		balance += balance * (interestRate/100); 
		return balance;
	}

	@Override
	public void withdraw(double money) {
		if(money > this.balance) {
			System.out.println(" Not ALLOWED! ");	
		}
		if(money < (this.balance - 1000)) {
			System.out.println(" Withdrawing Money : " + money);
			this.balance = calBalance() - money;
		}
		else {
			System.out.println("NO MONEY HERE");
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Your Final Balance(+Interest Rate) : " + calBalance() + " Your InterestRateAMOUNT : " + interestRate ;
	}
	

}
