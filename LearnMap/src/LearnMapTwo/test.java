package LearnMapTwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		String s1;
		int num;
		String a;
		char a1;
		Scanner sc =new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
		s1=sc.next();
		a=sc1.next();
		a1=a.charAt(0);
		num=getNum(s1, a1);
		Map<Character,Integer> map=new HashMap<>();
		map.put(a1, num);
		System.out.println(map.get(a1));
		sc.close();
		sc1.close();
		
	}
	public static int getNum(String string,char ch) {
		int count=0;
		char array[]=string.toCharArray();	
		for(int a=0;a<array.length;a++) {
			if(array[a]==ch) count++;
		}
		return count;
	}
	

}
