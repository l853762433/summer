package com.m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.m.model.TianqiResponse;

public class TianqiService {
	
		public String nowUrl="https://api.seniverse.com"
				+ "/v3/weather/now.json?"
				+ "key=vpsbq8dbpwfl9k2d"
				+ "&language=zh-Hans&unit=c&location=";
	
		public String getTianqi(String city) {
			String result;
			
			String urlStr=nowUrl+city;
			System.out.println(urlStr);
			
			try {
				URL url=new URL(urlStr);
				HttpURLConnection con=(HttpURLConnection)url.openConnection();
				con.connect();
				InputStream is=con.getInputStream();
				BufferedReader br=new BufferedReader(new InputStreamReader(is, "UTF-8"));
				StringBuilder sb=new StringBuilder();
				String line =null;
				while((line=br.readLine())!=null) {
					sb.append(line);
				}
				result= sb.toString();
		
			} catch (MalformedURLException e) {
				result="出现异常"+e.getMessage();
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
				result="出现异常"+e.getMessage();
			}
			return result;
		}
		
		public TianqiResponse getTianqiObject(String city) {
			
			TianqiResponse response =new TianqiResponse();
			Gson gson=new Gson();
			String responseStr=getTianqi(city);
			response=gson.fromJson(responseStr, TianqiResponse.class);

			return response;
			
		}

}
