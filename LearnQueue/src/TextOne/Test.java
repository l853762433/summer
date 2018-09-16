package TextOne;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Queue queue =new Queue();
		ArrayList<String> list=new ArrayList<>();
		queue.add_head("1", list);
		queue.add_head("2",list);
		queue.add_head("2",list);
		queue.add_head("2",list);
		queue.add_head("2",list);
		//queue.find_head("2",list);
		//queue.find_tail("2",list);
		//queue.remove_head(list);
		/*ListIterator<String> it =list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
	}
	
	
	
	
}
