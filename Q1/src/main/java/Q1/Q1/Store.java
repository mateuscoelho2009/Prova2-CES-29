package Q1.Q1;

import java.util.Vector;

public class Store {
	BD bdb;
	UserBD ubd;
	
	boolean isLogged;
	
	Store (BD bdb, UserBD ubd) {
		this.bdb = bdb;
		this.ubd = ubd;
		
		isLogged = false;
	}
	
	void LogIn (String userName) {
		isLogged = ubd.LogIn (userName);
	}
	
	void LogOut () {
		isLogged = false;
		ubd.LogOut();
	}
	
	Vector<Book> searchByRating (int minRating) {
		if (!isLogged) return null;
		return bdb.searchByRating(minRating);
	}
	
	Vector<Book> searchByName (String name) {
		if (!isLogged) return null;
		return bdb.searchByName(name);
	}
}
