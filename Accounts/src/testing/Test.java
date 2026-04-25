package testing;
import utility.*;

public class Test {

	public static void main(String[] args) {
		/* Testing MANUAL
		Account a1 = new SavingsAccount();
		System.out.println(a1);
		
		System.out.println("*******************************************");
		
		System.out.println(a1.calBalance());
		
		System.out.println("*******************************************");
		
		a1.withdraw(200);
		
		System.out.println("*******************************************");
		*/
		
		System.out.println("*******************************************");
		
		
		Account a2 = new SavingsAccount(51561515,"TIGER",1999);
    	System.out.println(a2);
		
	
		a2.withdraw(999);
		
		
		System.out.println(a2);
		
		System.out.println("*******************************************");
		/*
		Account [] a1 = {new SavingsAccount(51561515,"TIGER",45000),new SavingsAccount(787984,"Pathaan",8000), new RecurringAccount(123456,"KING", 60000, 45000, 2)};
		
		
		for(Account a : a1) {
			System.out.println(a);
		}
		*/
		System.out.println("*******************************************");
		
		Account a3 = new RecurringAccount(123333,"Don",98000, 1000 , 3);
		System.out.println(a3);
		a3.withdraw(500);
		
		System.out.println("*******************************************");
		

	}

}
