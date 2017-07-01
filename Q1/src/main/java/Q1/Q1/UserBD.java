package Q1.Q1;

public interface UserBD {
	enum SELLING_STATE {NONE, SENT, ARRIVED};
	
	boolean LogIn(String userName);

	void LogOut();

	void addBookToLaterSells(Book book);

	SELLING_STATE checkSellingStatus(String bname);

}
