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
		System.out.println("城市"+l.getName());
		System.out.println("天气"+now.getText());
		System.out.println("温度"+now.getTemperature());
		System.out.println("更新时间"+res.getLast_update());
		
	}
}
