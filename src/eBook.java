public class eBook extends Book{
	private int fileSize;
	
	private String fileFormat;
	
	public eBook(){
		
	}
	
	public eBook(String author, String ISBN, String type, String title, double price, int fileSize, String fileFormat){
		super(author, ISBN, type, title, price);
		this.fileFormat = fileFormat;
		this.fileSize = fileSize;
	}
	
	public String eBookDetails(){
		return super.getBookDetails() + " " + fileSize + " " + fileFormat;
	}
}
