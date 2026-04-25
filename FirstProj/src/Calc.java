
public class Calc {
	
	private int no1;
	private int no2;
	
	public Calc(int no1, int no2) {
		this.no1 = no1;
		this.no2 = no2;
	}
	
	public void Add() {
		int sum = this.no1 + this.no2;
		System.out.println("Add : " + this.no1  + "+" + this.no2 +"="+  sum);
	}
	
	public void Multiply() {
		int mul = this.no1 * this.no2;
		System.out.println("Mul : " + this.no1  + "*" + this.no2 +"="+  mul);
	}
	
	public void Div() {
		int div = this.no1/this.no2;
		System.out.println("Div : " + this.no1  + "/" + this.no2 +"="+  div);
	}
	
	public void Sub() {
		int sub = this.no1 - this.no2;
		System.out.println("Sub : " + this.no1  + "-" + this.no2 +"="+  sub);
	}

}
