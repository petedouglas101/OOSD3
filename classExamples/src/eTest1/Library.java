package eTest1;

import java.util.ArrayList;

public class Library {
	private Book aBook;
	private ArrayList<Book> bookList = new ArrayList<Book>();//ArrayList for storing the books

	//Library constructor which takes a book as a parameter and adds it to the collection
	public Library(Book aBook) {
		bookList.add(aBook);
	}

	//Synchronized method which allows only 1 thread at a time to access it to find a given book in the collection
	public synchronized  int findBookIndex(String isbn) {
		int index = 0;
		//For loop to searches through the collection to find the given book
		for (int i = 0; i < bookList.size(); i++) {
			//Checks each book in the collection against the book parameter
			if (bookList.get(i).getIsbn().equals(isbn)) {
				System.out.println("Book has been found!");
				index = i;
			} else {
				System.out.println("Book has not been found!");
				index = -1;
			}
		}

		return index;//Returns the index of the book in the collection if found, -1 if not found. 

	}

	//Synchronized method that allows only one thread to access it at one time. Takes an index as a parameter and removes that book from the collection
	public synchronized Book loanBook(int index) {
		Book aBook = null;

		for (int i = 0; i < bookList.size(); i++) {
			if (i == index) {
				aBook = bookList.get(i);
				bookList.remove(i);
				System.out.println("Book " + index + " has been taken out!");
			} else {
				aBook = null;
			}
		}

		return aBook;

	}

	//Adds the book back into the collection
	public void returnBook(Book aBook) {
		bookList.add(aBook);
		System.out.println("Book has been added back into the collection!");

	}

	public static void main(String[] args) {
		Book aBook = new Book("Peter", "Douglas", "Ab11228", 2008);//Creates a book
		Library library = new Library(aBook);//Adds book into the library collection
		
		//Creates two members for the same library
		Member member1 = new Member(library);
		Member member2 = new Member(library);
		
		//Starts both member threads
		member1.start();
		member2.start();

	}

}

class Member extends Thread {
	private Library library;
	private String isbn = "Ab11228";
	private int index;
	private Book aBook;

	public Member(Library library) {
		this.library = library;
	}

	//Run method that starts each of the methods for each member
	public void run() {
		index = library.findBookIndex(isbn);
		aBook = library.loanBook(index);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		library.returnBook(aBook);

	}

}
