package Q3.Q3;

public class GenericView {
	Class<?> c;
	
	public GenericView (Object o) {
		c = o.getClass();
	}
	
	public void printObjectDetails(Object o, String objName, String objRollNo) {
		//if (c.equals(getClass())) {
		System.out.println(o.getClass().getName() + ": ");
		System.out.println("Name: " + objName);
		System.out.println("Roll No: " + objRollNo);
		//}
	}
}
