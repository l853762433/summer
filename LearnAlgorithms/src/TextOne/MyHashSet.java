package TextOne;


import java.util.Iterator;
import java.util.List;

public class MyHashSet {
		
		
		public void put(Student student,List<Student> list) {
			//Iterator<Student> it =list.iterator();
			if(list.contains(student)) { System.out.println("�Ѿ�����"+student.getName());}
			else {
				list.add(student);
			}
			
			/*while(it.hasNext()) {
				if(!(it.next().equals(student))) {
					System.out.println("�Ѿ�����"+student.getName());
				}
				
			}*/
			
	}
		public void remove(Student student,List<Student> list) {
			Iterator<Student> it =list.iterator();
			while(it.hasNext()) {
				if(it.next().equals(student)) {
					list.remove(student);
				}
				else {
					System.out.println("������"+student.getName());
					break;
				}
			}
			
			
		}
		public void get(List<Student> list) {
			Iterator<Student> it =list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}
		
}


