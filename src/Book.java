public class Book {
	private String author;
	
	private String ISBN;
	
	private String title;
	
	private double price;
	
	public Book(){
		
	}
	
	public Book(String author, String ISBN, String title, double price){
		this.author = author;
		this.ISBN = ISBN;
		this.title = title;
		this.price = price;
	}
	
	public String getBookDetails(){
		return author + " " + ISBN + " " + title + " $" + price;
	}
}
