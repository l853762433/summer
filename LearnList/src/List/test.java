package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {

	public static void main(String[] args) {
		Employee one =new Employee("ss", "22", 2222.22);
		Employee two =new Employee("kk", "21", 3333.33);
		Employee three =new Employee("yy", "25", 6666.66);
		Employee four =new Employee("ll", "26", 2369.31);
		Employee five =new Employee("zz", "24", 5912.54);
		List<Employee> list=new ArrayList<>();
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		list.add(five);
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee s= it.next();
			System.out.println(s.toString());
		}
		int a=0;
		for (int b=1;b<list.size();b++) {
			if(list.get(a).getSalary()<list.get(b).getSalary()) {
				a=b;
			}
			
		}
		System.out.println(list.get(a).getName());
		
	}
	
}
