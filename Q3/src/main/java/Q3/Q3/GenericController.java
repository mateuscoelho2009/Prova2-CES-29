package Q3.Q3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GenericController {
	private Object model;
	private GenericView view;

	private GenericController(Object model) {
		this.model = model;
		this.view = new GenericView(model);
	}
	
	static GenericController getObjectController (Object model) {
		return new GenericController(model);
	}

	public void setObjectName(String name) {
		Class<?>[] paramString = new Class[1];
		paramString[0] = String.class;
		
		Class<?> c = model.getClass();
		Method method;
		try {
			method = c.getDeclaredMethod("setName", paramString);
			method.invoke(model, name);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public String getStudentName() {
		Class<?> noparams[] = {};
		
		Class<?> c = model.getClass();
		Method method;
		try {
			method = c.getDeclaredMethod("getName", noparams);
			return (String) method.invoke(model, null);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return "";
	}

	public void setStudentRollNo(String rollNo) {
		Class<?>[] paramString = new Class[1];
		paramString[0] = String.class;
		
		Class<?> c = model.getClass();
		Method method;
		try {
			method = c.getDeclaredMethod("setRollNo", paramString);
			method.invoke(model, rollNo);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public String getStudentRollNo() {
		Class<?> noparams[] = {};
		
		Class<?> c = model.getClass();
		Method method;
		try {
			method = c.getDeclaredMethod("getRollNo", noparams);
			return (String) method.invoke(model, null);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return "";
	}

	public void updateView() {
		Class<?> noparams[] = {};
		
		Class<?> c = model.getClass();
		Method methodname, methodroll;
		String sname = "", sroll = "";
		try {
			methodroll = c.getDeclaredMethod("getRollNo", noparams);
			sroll = (String) methodroll.invoke(model, null);
			methodname = c.getDeclaredMethod("getName", noparams);
			sname = (String) methodname.invoke(model, null);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		view.printObjectDetails(model, sname, sroll);
	}
}
