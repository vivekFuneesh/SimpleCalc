package com.vivek.simplecalc.service;

import java.math.BigDecimal;
import java.math.MathContext;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ServeClient implements ClientRequirements{

	public String add(String a, String b) {
		String result="";
		try {
			if(a==null || b==null)return a!=null?a:(b!=null?b:"");
			BigDecimal bd1=new BigDecimal(a);
			BigDecimal bd2=new BigDecimal(b);

			result=bd1.add(bd2).toPlainString();
		}catch(Exception er) {
			result=er.getMessage();
		}
		return result;
	}

	public String subtract(String a, String b) {
		String result="";
		try {
			if(a==null || b==null)return a!=null?a:(b!=null?b:"");
			BigDecimal bd1=new BigDecimal(a);
			BigDecimal bd2=new BigDecimal(b);
			result=bd1.subtract(bd2).toPlainString();
		}catch(Exception er) {
			result=er.getMessage();
		}
		return result;
	}

	public String multiply(String a, String b) {
		String result="";
		try {
			if(a==null || b==null)return a!=null?a:(b!=null?b:"");
			BigDecimal bd1=new BigDecimal(a);
			BigDecimal bd2=new BigDecimal(b);
			result=bd1.multiply(bd2).toPlainString();
		}catch(Exception er) {
			result=er.getMessage();
		}
		return result;
	}

	public String divide(String a, String b) {
		String result="";
		try {
			if(a==null || b==null)return a!=null?a:(b!=null?b:"");
			BigDecimal bd1=new BigDecimal(a);
			BigDecimal bd2=new BigDecimal(b);
			result=bd1.divide(bd2,MathContext.DECIMAL128).toPlainString();
		}catch(Exception er) {
			result=er.getMessage();
		}
		return result;
	}

	public String expr(String expr, RestTemplate rt) {
		String res="";
		try {
			JSONObject jo=new JSONObject();
			HttpHeaders headers=new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			jo.put("expr", expr);
			HttpEntity<String> request=new HttpEntity<String>(jo.toString(),headers);
			res=rt.postForObject("http://api.mathjs.org/v4/",request, String.class);
			jo=new JSONObject(res);
			res=jo.getString("result");
		}catch(Exception er) {
			res=er.getMessage();
		}
		return res;
	}


}
