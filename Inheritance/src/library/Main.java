package library;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book bb = new Book();
		bb.display();
		System.out.println("DIFF : " + bb.calculateCost());
		bb.display();
		
		System.out.println("************************************");
		
		Book bb1 = new PaperBook();
		bb1.display();
		System.out.println("DIFF : " + bb1.calculateCost());
		
		System.out.println("************************************");
		
		Book bb2 = new eBook();
		bb2.display();
		System.out.println("DIFF : " + bb2.calculateCost());
		
		
	}

}
