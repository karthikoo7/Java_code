import java.util.Scanner;

public class Main2 {
	
	
	public static void main(String [] args) {
		/*
	Book b1 = new Book();
	b1.display();
	
	Book b2 = new Book("Study of Vednata");
	b2.display();
	b2.setPrice(500);
	b2.display();
	
	Book b3 = new Book("The Dancing Monkey");
	b3.display();
	
	
	
	/*
	for(int i = 0; i<arr.length;i++) {
		arr[i] = b;
	}
	
		
	
	
	Scanner sc = new Scanner(System.in);
	
	int [] arr1 = new int [5];
	
	for(int i = 0; i<arr1.length;i++) {
		
		System.out.print("Enter : ");
		arr1[i] = sc.nextInt();
		
		System.out.println(); 
		}
	
		System.out.println("Bye");
		
		Book [] arr = new Book[3];
		
		arr[0] = new Book();
		arr[1] = new Book("The book of Philosophy");
		arr[2] = new Book("The Harry Henry");
		
	*/
	
		
		
		Book [] arr = {new Book(),new Book("The book of Philosophy"), new Book("The Harry Henry")};
		
		for(Book bb : arr) {
			bb.display();
		}
		float maxPrice = 0;
		
		for(Book bb : arr) {
			if(bb.bookPrice > maxPrice) {
				maxPrice = bb.bookPrice;
			}
			}
		for(Book bb : arr) {
			if(bb.bookPrice == maxPrice) {
				System.out.println("Maximum Priced Book ");
				bb.display();
			}
			}
		
	
	}
	
}


