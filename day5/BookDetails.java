package day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class BookDetails {
	public static void main(String[] args) {


		Book book = new Book("J.K Rowling","Harry Potter",200);
		Book book2 = new Book("J.K Rowling","Harry Potter",200);
		Book book3 = new Book("Narayana Murthy","A Better India: A Better World",350);

		//		HashSet<Book> book_set=new HashSet(); 
		//		book_set.add(book);
		//		book_set.add(book2);
		//		book_set.add(book3);

		List<Book> book_list = new ArrayList<Book>();
		book_list.add(book);
		book_list.add(book2);

		//	    TreeSet<Book> book_tree_set = new TreeSet<Book>();
		//		
		//		book_tree_set.add(book);
		//		book_tree_set.add(book2);
		//		book_tree_set.add(book3);
		//		String bookname = "test";

		//		for (Book b: book_list) {
		//			if(!bookname.equals(b.getTitle())) {
		//				System.out.println("Book is not available");
		//			}
		//			System.out.println(b);
		//			
		//		}
		//		System.out.println("Book is avilable");
		BookDetails bookDetails = new BookDetails();
		bookDetails.isBookAvailable(book_list);
	}



	public void isBookAvailable(List<Book> book_list) {
		System.out.print("Search book with name=");
		Scanner scanner = new Scanner(System.in);
		String bookname = scanner.nextLine();
		int count = 0;
		try {
			for (Book b: book_list) {
				if(bookname.equals(b.getTitle())) {
					count = count + 1;
				}

				if(count == 0) {
					throw new  BookNotFoundException("Book not found exception");
				}
			}
			System.out.println("Book is there in stack");
		}
		catch(BookNotFoundException e){
			e.printStackTrace();

		}


	}


}
