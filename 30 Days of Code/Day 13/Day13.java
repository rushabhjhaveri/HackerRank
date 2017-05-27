import java.util.*;
public class Day13 {
	abstract class Book {
	    String title;
	    String author;

	    Book(String t, String a) {
	        title = t;
	        author = a;
	    }

	    abstract void display();
	}

	class MyBook extends Book {
	    private int price;

	    MyBook(String t, String a, int p) {
	        super(t, a);
	        price = p;
	    }

	    @Override
	    void display() {
	        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
	    }
	}
}
