package Q1.Q1;

public class MockUserBD implements UserBD {

	public boolean LogIn(String userName) {
		return true;
	}

	public void LogOut() {
		
	}

	public void addBookToLaterSells(Book book) {
		// TODO Auto-generated method stub
		
	}

	public SELLING_STATE checkSellingStatus(String bname) {
		// TODO Auto-generated method stub
		return SELLING_STATE.ARRIVED;
	}

}
