package com.m.model;

import java.util.List;

public class TianqiResponse {
	
	private List<Result> results;

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}
	
	
	public void print() {
		Result res =results.get(0);
		Location l=res.getLocation();
		Now now =res.getNow();
		System.out.println("����"+l.getName());
		System.out.println("����"+now.getText());
		System.out.println("�¶�"+now.getTemperature());
		System.out.println("����ʱ��"+res.getLast_update());
		
	}
}
