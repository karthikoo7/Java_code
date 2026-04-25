package utility.math;

public class Calculator {
	static int a;
	static int b;
	
	static {
		a = 1;
		b = 1;
	}

	
	public static void Add(int a , int b){
		int sum = a + b;
		
		System.out.println("ADDITION : " + sum);
		
		
	}
	
	public static void Sub(int a , int b){
		int sub = a-b;
		
		System.out.println("SUBTRACT : " + sub);
		
		
	}
	
	

}
