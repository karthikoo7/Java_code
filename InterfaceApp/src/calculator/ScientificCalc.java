package calculator;

public class ScientificCalc implements IscientificCalc {

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

	@Override
	public double sin(double angle) {
		// TODO Auto-generated method stub
		return Math.sin(angle);
	}

	@Override
	public double cos(double angle) {
		// TODO Auto-generated method stub
		return Math.cos(angle);
	}

	@Override
	public double tan(double angle) {
		// TODO Auto-generated method stub
		return Math.tan(angle);
	}

}
