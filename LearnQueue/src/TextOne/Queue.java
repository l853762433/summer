package TextOne;

import java.util.ArrayList;

public class Queue {
	//˫����д�ͷ���Ԫ��
	public static void add_head(String string,ArrayList<String> list) {
		list.add(0, string);
	}
	//˫����д�β���Ԫ��
	public static void add_tail(String string,ArrayList<Object> list) {
		list.add(list.size(),  string);
	}
	//˫����д�ͷɾ��Ԫ��
	public static void remove_head(ArrayList<Object> list) {
		list.remove(0);
	}
	//˫����д�βɾ��Ԫ��
	public static void remove_tail(ArrayList<Object> list) {
		list.remove(list.size()-1);
	}
	//�ж�˫���б��Ƿ�Ϊ��
	public static boolean is_empty(ArrayList<Object> list) {
		if(list.get(0).equals(null)&&list.get(list.size()-1).equals(null))
			return true;
		return false;
	}
	//��ͷ���ң���������λ��
	public static void find_head(String a,ArrayList<String> list) {
		Object[] array=list.toArray();
		for(int i=0;i<array.length;i++) {
			if(array[i].equals(a)) {
			System.out.println(i);
			}
		}
	}
	//��β���ң���������λ��
	public static void find_tail(String a,ArrayList<String> list) {
		Object[] array=list.toArray();
		for(int i=array.length-1;i>=0;i--) {
			if(array[i].equals(a)) {
			System.out.println(i);
			}
		}
	}
	//��
	public static void change(int a ,String string,ArrayList<String> list) {
		list.set(a, string);
	}
}
