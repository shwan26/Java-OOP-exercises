package Author2_2;

import java.util.Arrays;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthors() {
		return authors;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		return "Book[name="+getName()+",authors={"+Arrays.toString(authors)+"},price="+getPrice()+",qty="+getQty()+"]";
	}
	
	public String getAuthorNames() {
		String authorsName = "";
		for (int i = 0; i<authors.length; i++) {
			authorsName += authors[i].getName();
			authorsName += ",";
		}
		return authorsName;
	}
}
