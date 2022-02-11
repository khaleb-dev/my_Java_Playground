package book;

// Ex 5.9 Pg 115
public class Book {
	private String name;
	private String author;
	private String publisher;
	private int isbn;
	private String publishedDate;
	
	Book(String name, String author, String publisher, int isbn, String publishedDate) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.publishedDate = publishedDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String displayBookInfo() {
		return name + " written by " + author + ", and published by " + publisher + " with isbn number " + isbn + " on " + publishedDate + ".";
	}
}