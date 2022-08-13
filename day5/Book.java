package day5;

public class Book implements Comparable<Book> {
	
	private static int identification =100;
	private int id;
	private String author, title;
	private int numberOfPages;
	
	public Book( String author, String title, int numberOfPages) {
		this.id = identification++;
		this.author = author;
		this.title = title;
		this.numberOfPages = numberOfPages;
	}

	public static int getIdentification() {
		return identification;
	}

	public static void setIdentification(int identification) {
		Book.identification = identification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", numberOfPages=" + numberOfPages + "]";
	}

	@Override
	public int compareTo(Book b) {
		
//		return -title.compareTo(b.getTitle());
		
		return Integer.compare(b.getId(),id);
	}
    
	


}
