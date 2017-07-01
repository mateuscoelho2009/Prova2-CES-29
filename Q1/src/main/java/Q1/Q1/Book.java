package Q1.Q1;

public class Book {
	private String name;
	int sumRating;
	int numPeopleRated;
	
	Book (String name) {
		numPeopleRated = 0;
		sumRating = 0;
		this.name = name;
	}
	
	void rate (int newRate) {
		if (newRate > 5) newRate = 5;
		if (newRate < 0) newRate = 0;
		
		numPeopleRated++;
		sumRating += newRate;
	}
	
	float getRate () {
		return sumRating / numPeopleRated;
	}
	
	String getName () {
		return name;
	}
}
