import java.util.Date;
public class BookOrder extends eBook {
	private Date orderDate;
	
	private String orderNumber;
	
	private String[] orderLines = new String[10];
	
	private int numberOrderLines;
	
	public BookOrder(){
		
	}
	
	public BookOrder(String orderNumber){
		this.orderNumber = orderNumber;
				
	}
	
	public void addBook(Book book){
		for (int i = 0; i < orderLines.length; i++){
			if (orderLines[i] == null) {
				orderLines[i] = book.getBookDetails();
				break;
			}
		}
		
	}
	public Date getOrderDate(){
		return orderDate;
	}
}