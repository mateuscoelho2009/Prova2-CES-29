package Q1.Q1;

import java.util.Vector;

public class MockBD extends BD {
	
	
	MockBD () {
		books = new Vector<Book>();
		for (int i = 0; i < 10; i++) {
			books.add(new Book("Livro " + i, 10 - i, (i + 1) * 7.2f));
		}
	}

	public Vector<Book> searchByRating(int minRating) {
		Vector<Book> res = new Vector<Book>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getRate() >= minRating) {
				res.add(books.get(i));
			}
		}

		return res;
	}

	public Vector<Book> searchByName(String name) {
		Vector<Book> res = new Vector<Book>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getName().contains(name)) {
				res.add(books.get(i));
			}
		}

		return res;
	}
	
	public Vector<Book> searchByPrice (float price) {
		Vector<Book> res = new Vector<Book>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getPrice() < price) {
				res.add(books.get(i));
			}
		}

		return res;
	}

	public boolean buy(String name) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getName().equals(name) &&
					books.get(i).getQnt() > 0) {
				books.get(i).buy();
				return true;
			}
		}
		return false;
	}

	public void rate(String bname, int rate) {
		// TODO Auto-generated method stub
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getName().equals(bname) &&
					books.get(i).getQnt() > 0) {
				books.get(i).rate(rate);
			}
		}
	}

	public void review(String bname, String review) {
		// TODO Auto-generated method stub
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getName().equals(bname) &&
					books.get(i).getQnt() > 0) {
				books.get(i).review(review);
			}
		}
	}
}
