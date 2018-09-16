package ls.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import ls.hibernate.pojo.Student;

public class StudentDao {
	
		private Session session;
	
		public StudentDao(Session session) {
			this.session=session;
		}
		public List<Student> listStudents(){
			Query<Student> query=session.createQuery("from Student", Student.class);
			return query.getResultList();
		}
		
		public List<Student> getStudentsByName(String name){
			Query<Student> query=session.createQuery("from Student where firstname like :name or lastname like :name ", Student.class);
			query.setParameter("name", "%"+name+"%");
			return query.getResultList();
		}
		
		public void insert(Student student) {
			Transaction tx= session.beginTransaction();
			session.save(student);
			session.flush();
			tx.commit();
		}
		
}
