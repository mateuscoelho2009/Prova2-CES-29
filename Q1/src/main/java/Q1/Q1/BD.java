package Q1.Q1;

import java.util.Vector;

public interface BD {

	Vector<Book> searchByRating(int minRating);

	Vector<Book> searchByName(String name);

}
