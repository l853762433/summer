package TextOne;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		//getClassInstance();
		//invocationMethod();
		/*changeVariables() ;
		getDeclaredMethods();
		 getMethods();*/
		//getSuper();
		//getInterface();
		reflectPerson("TextOne.Chinese","ll",22);
		reflectPerson("TextOne.Japanese","ll",22);
		reflectPerson("TextOne.Person","ll",22);
		reflectPerson("TextOne.American","ll",22);
	}
	//�����ַ������Person��Class����
	public static void getClassInstance() {
		//��һ�ַ���
				Person p1=new Person();
				Class c1=p1.getClass();
				//�ڶ��ַ���
				String classname="TextOne.Person";
				try {
					Class c2 =Class.forName(classname);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				//�����ַ���
				Class c3=Person.class;
	}
	//�ò�ͬ��������Person�����ʵ��
	public static void getObjectInstance() {
		//��һ�ַ���
		Class ps1=Person.class;
		try {
			Object o=ps1.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		//�ڶ��ַ���
		try {
			Constructor c=ps1.getConstructor(new Class[] {String.class,int.class});
			Person o =(Person)c.newInstance(new Object[] {"ls",22});
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	//����set��get����
	public static void invocationMethod() {
		Class ps1=Person.class;
		try {
			Object o=ps1.newInstance();
			Method m=ps1.getMethod("setName", new Class[] {String.class});
			m.invoke(o, new Object[] {"yy"});
			Method m1=ps1.getMethod("getName", new Class[] {});
			System.out.println(m1.invoke(o, new Object[] {}));
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
		}
			
	}
	//��д���Ե�ֵ
	public static void changeVariables() {
	Class cc=Person.class;
	try {
		Object o=cc.newInstance();
		Field f=cc.getDeclaredField("name");
		f.setAccessible(true);
		f.set(o, "kk");
		System.out.println(f.get(o));
		
	} catch (InstantiationException e) {
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		e.printStackTrace();
	} catch (NoSuchFieldException e) {
		e.printStackTrace();
	} catch (SecurityException e) {
		e.printStackTrace();
	}
	}
	//��ȡChinese�����Զ��巽��
	public static void getDeclaredMethods() {
		Class cc=Chinese.class;
		Method[] methods=cc.getDeclaredMethods();
		for(Method m:methods) {
			System.out.println(m.getName());
		}
	}
	//��ȡchinese�����й�������
	public static void getMethods() {
		Class cc=Chinese.class;
		Method[] methods=cc.getMethods();
		for(Method m:methods) {
			System.out.println(m.getName());
		}
	}	
	//��ȡChinese�ĸ�����Ϣ
	public static void getSuper() {
		Class cc=Chinese.class;
		System.out.println(cc.getSuperclass());
		
	}
	//��ȡChinese�����н����Ϣ
	public static void getInterface() {
		Class cc=Chinese.class;
		Class d[]=cc.getInterfaces();
		for (Class e:d) {
			System.out.println("�ӿڵ�����"+e);
		}
	}
	//дһ������reflectPerson����
	public static void reflectPerson(String className,String name,int age) {
			try {
				Class<?> cc= Class.forName(className);
				Object o=cc.newInstance();
				Class<?> d[]=cc.getInterfaces();
				for (Class<?> e:d) {
					//System.out.println(e.getName());
					if(e.getName().equals("TextOne.Fightable")) {
						Method m=cc.getMethod("fight",new Class[] {});
						m.invoke(o, new Object[] {});
					}
				}
				Method[] methods=cc.getDeclaredMethods();
				for(Method n:methods) {
					//System.out.println(n.getName());
					if(n.getName().equals("pingpang")) {
						n.invoke(o, new Class[] {});
					}
					if(n.getName().equals("eatSusi")) {
						n.invoke(o, new Class[] {});
					}
				}
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (SecurityException e1) {
				e1.printStackTrace();
			} catch (IllegalArgumentException e1) {
				e1.printStackTrace();
			} catch (NoSuchMethodException e1) {
				e1.printStackTrace();
			} catch (InvocationTargetException e1) {
				e1.printStackTrace();
			}
	}

}
