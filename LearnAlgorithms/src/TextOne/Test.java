package TextOne;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		MyHashSet myhashset =new MyHashSet();
		Student student1=new Student("ll", 22);
		Student student2=new Student("ss", 23);
		Student student3=new Student("ll", 22);
		Student student4=new Student("aa", 22);
		List<Student> list =new ArrayList<>();
		myhashset.put(student1, list);
		myhashset.put(student2, list);
		myhashset.put(student3, list);
		myhashset.remove(student4, list);
		
		myhashset.get(list);
		
		
	}

}
