package com.vivek.simplecalc.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.json.JSONObject;

public class RoughWork {

	
	public static void main(String...strings ) throws Exception {
		
		String expr="3*2+45%6";
		
		System.out.println(expr.replaceAll("\\+", "%2B"));
		
		JSONObject jo=new JSONObject("{\"expr\":"+expr+"}");
		
		
		URL f=new URL("http://google.com");
		URI s=new URI("http://api.mathjs.org/v4/?expr="+jo);
		
		
		HttpURLConnection huc;
		
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(s.toURL().openConnection().getInputStream()));
		
		//while
		System.out.println(bf.readLine());
	}
	static class my{
		String expr="3*4+5";
		public String getExpr() {return expr;}
	}
	
}
