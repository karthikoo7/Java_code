package apps;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String pwd = new String(args[0]); // will take value from command line
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your password: " );
		String pwd = sc.next();
		
		try {
			if(pwd.length()>12) {
				throw new PasswordTooLongException();
			}
			else if(pwd.length()<8) {
				throw new PasswordTooShortException();
			}
			else {
				System.out.println("PASSWORD ACCEPTED :) ");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
