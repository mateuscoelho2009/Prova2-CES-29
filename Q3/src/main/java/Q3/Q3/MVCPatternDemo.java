package Q3.Q3;


public class MVCPatternDemo {
	public static void main(String[] args) {
		// fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();

		// Create a view : to write student details on console
		//StudentView view = new StudentView();

		GenericController controller = GenericController.getObjectController(model);

		controller.updateView();

		// update model data
		controller.setObjectName("John");

		controller.updateView();
		
		Professor modelProf = retriveProfessorFromDatabase();

		// Create a view : to write student details on console
		//StudentView view = new StudentView();

		controller = GenericController.getObjectController(modelProf);

		controller.updateView();

		// update model data
		controller.setObjectName("Lennon");

		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	
	private static Professor retriveProfessorFromDatabase() {
		Professor p = new Professor();
		p.setName("Alderweird");
		p.setRollNo("152");
		return p;
	}

}
