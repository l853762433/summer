package TextOne;

import java.util.ArrayList;
import java.util.ListIterator;


public class Test {

	public static void main(String[] args) {
			Stack stack=new Stack();
			ArrayList<String> list =new ArrayList<String>();
			stack.add("a", list);
			stack.add("b", list);
			stack.add("c", list);
			stack.remove(list);
			stack.find("a", list);
			stack.change(0, "ll", list);
			ListIterator<String> it =list.listIterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			
	}

}
