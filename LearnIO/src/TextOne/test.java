package TextOne;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class test {

	public static void main(String[] args) {
		
		/*for(int i=0;i<2;i++) {
		StudentFactory studentfactory=new StudentFactory();
		studentfactory.studentFactory();
	}*/
	HashMap<Student,Double> map =new HashMap<>();
	Student student1 =new Student("ll",89.2,88.6,88.9);
	Student student2 =new Student("ss",70.6,82.5,60.6);
	Student student3 =new Student("aa",30.2,40.5,50.6);
	StudentFactory studentfactory =new StudentFactory();
	studentfactory.studentFactory(student1, map);
	studentfactory.studentFactory(student2, map);
	studentfactory.studentFactory(student3, map);
	String filePath="C:\\Users\\Administrator.PC-20180122XMIS\\Desktop\\newfile.txt";
	File file=new File(filePath);
	try {
		if(file.exists()) {
			System.out.println("ÒÑ¾­´æÔÚ");
			file.delete();
		}
		else {
			file.createNewFile();
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	/*try {
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw =new BufferedWriter(fw);
		for(Map.Entry<Student, Double> entry:map.entrySet()) {
			
			String str=entry.getKey()+":"+entry.getValue();
			bw.write(str);
			bw.newLine();
			System.out.println(str);
			//System.out.println(entry.getKey()+":"+entry.getValue());
		}
		bw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}*/
	List<Map.Entry<Student,Double>> list =new ArrayList<Map.Entry<Student,Double>>(map.entrySet());
	Collections.sort(list,new Comparator<Map.Entry<Student, Double>>() {
		public int compare(Entry<Student, Double> o1,Entry<Student, Double> o2) {
			return o1.getValue().compareTo(o2.getValue());
		}
	});
	FileWriter fw;
	try {
		fw = new FileWriter(file);
		BufferedWriter bw =new BufferedWriter(fw);
		for(Map.Entry<Student, Double> mapping:list) {
			bw.write(mapping.getKey()+":"+mapping.getValue());
			bw.newLine();
		}
		
		bw.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}

	
}
	

	
		
	
}

