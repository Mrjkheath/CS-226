public class Book {
	private String author;
	
	private String ISBN;
	
	private String title;
	
	private String type;
	
	private double price;
	
	public Book(){
		
	}
	
	public Book(String author, String ISBN, String type, String title, double price){
		this.author = author;
		this.ISBN = ISBN;
		this.type = type;
		this.title = title;
		this.price = price;
		
	}
	
	public String getBookDetails(){
		return author + " " + ISBN + " " + type + " " + title + " $" + price;
	}
}
