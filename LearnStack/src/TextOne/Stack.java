package TextOne;

import java.util.ArrayList;


public class Stack {
		
	//public ArrayList<String> list; 
	//ջ���Ԫ��
	public static void add(String string,ArrayList<String> list) {
			list.add(0, string);
	}
	//ջɾ��Ԫ��
	public static void remove(ArrayList<String> list) {
		list.remove(0);
	}
	//ջ����Ԫ��
	public static void find(String string,ArrayList<String> list) {
		Object[] array=list.toArray();
		for(int i=array.length-1;i>=0;i--) {
			if(array[i].equals(string)) {
			System.out.println(i);
			}
		}
	}
	//ջ��Ԫ��
	public static void change(int a,String string,ArrayList<String> list) {
		list.set(a, string);
	}
	
}
