package LearnMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test {

	public static void main(String[] args) {
			Student one =new Student("ll",21);
			Student two =new Student("ss",22);
			Map<Student,String> map =new HashMap<>();
			map.put(one, "xiangyuanlu");
			map.put(two, "gongshuqu");
			
			for(Map.Entry<Student,String> entry:map.entrySet()) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
			Iterator<Map.Entry<Student,String>> it =map.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<Student, String> entry=it.next();
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
	}

}
