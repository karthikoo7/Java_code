package calculator;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Icalculator c1 = new SimpleCalculator();
		
		System.out.println(c1.add(10, 20));
		System.out.println(c1.multiply(10, 20));
		System.out.println(c1.subtract(10, 20));
		System.out.println(c1.divide(10, 20));
		*/
		
		IscientificCalc c2 = new ScientificCalc();
		
		System.out.println(c2.sin(30));
		System.out.println(c2.cos(90));
		System.out.println(c2.tan(45));
		
		
		
		
		
	}

}
