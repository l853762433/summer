package com.m;

import com.m.model.TianqiResponse;

public class Test {
		TianqiService service =new TianqiService();
		
	public static void main(String[] args) {
		Test test	=new Test();
		String city="hangzhou";
//		String tianqi=test.service.getTianqi(city);
//		System.out.println(tianqi);
		
		TianqiResponse tr=test.service.getTianqiObject(city);
		tr.print();
	}

}
