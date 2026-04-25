package library;

public class PaperBook extends Book {

	private int numberOfPages;
	private Date dateOfPublication;

	public PaperBook() {
		super();
		// TODO Auto-generated constructor stub
		this.numberOfPages = 0;
		this.dateOfPublication = new Date();
	}


	public PaperBook(String bookTitle, double bookPrice, int numberOfPages, Date dateOfPublication) {
		super(bookTitle, bookPrice);
		this.numberOfPages = numberOfPages;
		this.dateOfPublication = dateOfPublication;
	}

	public void display() {
		super.display();
		System.out.println("No OF PAGES : " + this.numberOfPages);
		System.out.println("DATE OF PUBLICATION :  ");
		this.dateOfPublication.display();
	}
	
public double calculateCost() {
		
		
		if(bookPrice <= 500) {
			
			
			bookPrice = bookPrice + bookPrice * 0.07;
		}
		
	
		else if(bookPrice>500 && bookPrice <=1000) {
			
			bookPrice = bookPrice + bookPrice * 0.05;
			
		}
		
		else if(bookPrice>1000 && bookPrice <=5000) {
			
			bookPrice = bookPrice + bookPrice * 0.02;
			
		}	
		
		super.setPrice(bookPrice);
		
		
		return bookPrice;
		
	}
	
}
