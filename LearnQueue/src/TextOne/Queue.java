package TextOne;

import java.util.ArrayList;

public class Queue {
	//双向队列从头添加元素
	public static void add_head(String string,ArrayList<String> list) {
		list.add(0, string);
	}
	//双向队列从尾添加元素
	public static void add_tail(String string,ArrayList<Object> list) {
		list.add(list.size(),  string);
	}
	//双向队列从头删除元素
	public static void remove_head(ArrayList<Object> list) {
		list.remove(0);
	}
	//双向队列从尾删除元素
	public static void remove_tail(ArrayList<Object> list) {
		list.remove(list.size()-1);
	}
	//判断双向列表是否为空
	public static boolean is_empty(ArrayList<Object> list) {
		if(list.get(0).equals(null)&&list.get(list.size()-1).equals(null))
			return true;
		return false;
	}
	//从头查找，返回索引位置
	public static void find_head(String a,ArrayList<String> list) {
		Object[] array=list.toArray();
		for(int i=0;i<array.length;i++) {
			if(array[i].equals(a)) {
			System.out.println(i);
			}
		}
	}
	//从尾查找，返回索引位置
	public static void find_tail(String a,ArrayList<String> list) {
		Object[] array=list.toArray();
		for(int i=array.length-1;i>=0;i--) {
			if(array[i].equals(a)) {
			System.out.println(i);
			}
		}
	}
	//改
	public static void change(int a ,String string,ArrayList<String> list) {
		list.set(a, string);
	}
}
