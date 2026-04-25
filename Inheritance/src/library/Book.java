package library;

public class Book {
	
	private int bookId;
	protected double bookPrice;
	private String bookTitle;
	static int count = 0;
	
	public Book() {
		bookId = count;
		bookTitle = "Adventures of Spiderman";
		bookPrice = 2000;
		count++;
	}
	
	public Book(String bookTitle,double bookPrice) {
		this.bookId = count;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		//this.bookPrice = (float) (Math.random()*1000); //casting to float
		count++;
	}
	
	public double setPrice(double bookPrice) {
		return this.bookPrice = bookPrice;
	}
	
	public double calculateCost() {
		
		
		if(bookPrice <= 500) {
			
			bookPrice = bookPrice - bookPrice * 0.02;
			bookPrice = bookPrice + bookPrice * 0.07;
		}
		
	
		else if(bookPrice>500 && bookPrice <=1000) {
			bookPrice = bookPrice - bookPrice * 0.05;
			bookPrice = bookPrice + bookPrice * 0.05;
			
		}
		
		else if(bookPrice>1000 && bookPrice <=5000) {
			bookPrice = bookPrice - bookPrice * 0.07;
			bookPrice = bookPrice + bookPrice * 0.02;
			
		}	
		
		setPrice(bookPrice);
		
		return bookPrice;
		
	}
	
	public void display() {
		System.out.println("Book ID: " + bookId + " Book Title: " + bookTitle + " BookPrice: " + bookPrice);
	}

}
