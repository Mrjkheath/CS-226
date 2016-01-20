// Created by Jonathan Heath
public class Exercise9_2 {
	// The Main Method
	public static void main(String[] args) {
		// Creating a stock for the Oracle Corporation with set prices
		Stock stock1 = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		System.out.println("The symbol is: " + stock1.symbol);
		System.out.println("The name is: " + stock1.name);
		System.out.println("The previous closing price was " + stock1.previousClosingPrice);
		System.out.println("The current price is " + stock1.currentPrice);
		System.out.println("The price-change percentage is " + stock1.getChangePercent() + "%");

	}

}
// The Stock class
class Stock {
	// Data field for the Stock symbol
	String symbol;
	// Data field for the company name 
	String name;
	// Data field for the first price 
	double previousClosingPrice;
	// Data field for the second price
	double currentPrice;
	// Constructor for the Stock class
	Stock(String symbol2, String name2, double previousClosingPrice2, double currentPrice2) {
		// Switching each data field to match the getChangePrice method
		symbol = symbol2;
		name = name2;
		previousClosingPrice = previousClosingPrice2;
		currentPrice = currentPrice2;

	}
	/* The method used for calculating the price-change percentage between
	*  the previous closing price and the current price
	*/  
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}

}
