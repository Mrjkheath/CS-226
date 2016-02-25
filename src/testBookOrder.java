import java.util.Date;
public class testBookOrder extends BookOrder{
	public static void main(String[] args) {
		Book book1 = new Book("author1", "ISBN1", "book", "title1", 29.95);
		Book book2 = new Book("author2", "ISBN2", "book", "title2", 19.95);
		eBook book3 = new eBook("author3", "ISBN3", "eBook", "title3", 39.50, 2500, "MOBI");
		eBook book4 = new eBook("author4", "ISBN4", "eBook", "title4", 49.50, 1500, "PDF");
		Date date = new Date();
		
		BookOrder orderOne = new BookOrder("One");
		BookOrder orderTwo = new BookOrder("Two");
		BookOrder orderThree = new BookOrder("Three");
		BookOrder orderFour = new BookOrder("Four");
		
		orderOne.addBook(book1);
		orderTwo.addBook(book2);
		orderThree.addBook(book3);
		orderFour.addBook(book4);
		
		System.out.println(date);
		System.out.println(book1.getBookDetails());
		System.out.println(book2.getBookDetails());
		System.out.println(book3.eBookDetails());
		System.out.println(book4.eBookDetails());
		
	}
}