package library;

public class eBook extends Book {
	
	private String downloadUrl;
	private double sizeInMBs;
	
	public eBook() {
		super();
		// TODO Auto-generated constructor stub
		this.downloadUrl = "NA";
		this.sizeInMBs = 00.00;
		
	}

	public eBook(String bookTitle,double bookPrice, String downloadUrl, double sizeInMBs) {
		super(bookTitle,bookPrice);
		this.downloadUrl = downloadUrl;
		this.sizeInMBs = sizeInMBs;
	}
	
	public void display() {
		super.display();
		System.out.println("DOWNLOAD URL:   " + this.downloadUrl);
		System.out.println("SIZE : " + this.sizeInMBs);
	}
	
public double calculateCost() {
		
		
		if(bookPrice <= 500) {
			
			bookPrice = bookPrice - bookPrice * 0.02;
			
		}
		
	
		else if(bookPrice>500 && bookPrice <=1000) {
			bookPrice = bookPrice - bookPrice * 0.05;
			
			
		}
		
		else if(bookPrice>1000 && bookPrice <=5000) {
			bookPrice = bookPrice - bookPrice * 0.07;
			
			
		}	
		
		super.setPrice(bookPrice);
		
		
		return bookPrice;
		
	}
	
	
	

}
