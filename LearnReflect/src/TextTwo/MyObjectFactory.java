package TextTwo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyObjectFactory {
	
	String name;
	int age ;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "MyObjectFactory [name=" + name + ", age=" + age + "]";
	}

	public static void getObject(String className) {
		try {
			
			Class cc=MyObjectFactory.class;
			Class dd=Class.forName(className);
			Object o=cc.newInstance();
			Object p=dd.newInstance();
			Method m1=cc.getMethod("setName", new Class[] {String.class});
			m1.invoke(o, new Object[] {"name initial value"});
			Method m2=cc.getMethod("setAge",new Class[] {int.class});
			m2.invoke(o,new Object[] { 1});
			Method m3=cc.getDeclaredMethod("getName", new Class[] {});
			System.out.println(m3.invoke(o, new Object[] {}));
			Method m4=cc.getDeclaredMethod("getAge", new Class[] {});
			System.out.println(m4.invoke(o, new Object[] {}));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
