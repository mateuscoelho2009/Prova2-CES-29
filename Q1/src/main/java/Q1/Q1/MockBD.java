package Q1.Q1;

import java.util.Vector;

public class MockBD {
	Vector<Book> books;
	
	MockBD () {
		for (int i = 0; i < 10; i++) {
			books.add(new Book("Livro " + i));
		}
	}
}
