package calculator;

public class SimpleCalculator implements Icalculator {
	
	

	public SimpleCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double subtract(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
