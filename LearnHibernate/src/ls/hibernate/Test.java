package ls.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ls.hibernate.dao.StudentDao;
import ls.hibernate.pojo.Student;

public class Test {

	public static void main(String[] args) {
		 SessionFactory sf =
	                new Configuration().configure().buildSessionFactory();
		 
		 Session session=sf.openSession();
		 System.out.println(session);
		 
		 List<Student> students=new StudentDao(session).getStudentsByName("shuai");
		 for(Student s:students) {
			 System.out.println(s);
		 }
		 
		
		
//		 Student student =session.get(Student.class, 1);
//		 System.out.println(student);
		 session.close();
	}

}
