package TextOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentFactory {
		
	/*public  void studentFactory() {
		String name;
		double language;
		double math;
		double english;
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		name=sc1.next();
		language=sc2.nextDouble();
		math=sc3.nextDouble();
		english=sc4.nextDouble();
		double totle=language+math+english;
		Student student=new Student(name,language,math,english);
		Map<Student,Double> map=new HashMap<>();
		map.put(student, totle);
		for(Map.Entry<Student, Double> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}*/
	public  void studentFactory(Student student,HashMap<Student, Double> map) {
		
		double totle=student.getLanguage()+student.getMath()+student.getEnglish();
		map.put(student, totle);
	}
}
