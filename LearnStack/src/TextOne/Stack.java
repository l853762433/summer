package TextOne;

import java.util.ArrayList;


public class Stack {
		
	//public ArrayList<String> list; 
	//栈添加元素
	public static void add(String string,ArrayList<String> list) {
			list.add(0, string);
	}
	//栈删除元素
	public static void remove(ArrayList<String> list) {
		list.remove(0);
	}
	//栈查找元素
	public static void find(String string,ArrayList<String> list) {
		Object[] array=list.toArray();
		for(int i=array.length-1;i>=0;i--) {
			if(array[i].equals(string)) {
			System.out.println(i);
			}
		}
	}
	//栈改元素
	public static void change(int a,String string,ArrayList<String> list) {
		list.set(a, string);
	}
	
}
