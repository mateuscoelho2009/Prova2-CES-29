package Q1.Q1;

import java.util.Vector;

public class Book {
	private String name;
	int sumRating;
	int numPeopleRated;
	int qnt;
	float price;
	Vector<String> reviews;
	
	Book (String name, int qnt, float price) {
		numPeopleRated = 0;
		sumRating = 0;
		this.name = name;
		this.qnt = qnt;
		this.price = price;
		reviews = new Vector<String>();
	}
	
	public void rate (int newRate) {
		if (newRate > 5) newRate = 5;
		if (newRate < 0) newRate = 0;
		
		numPeopleRated++;
		sumRating += newRate;
	}
	
	public void review (String r) {
		reviews.add(r);
	}
	
	public float getRate () {
		return sumRating / numPeopleRated;
	}
	
	public String getName () {
		return name;
	}
	
	void buy () {
		if (qnt != 0)
			qnt--;
	}
	
	float getPrice () {
		return price;
	}
	
	int getQnt () {
		return qnt;
	}
}
