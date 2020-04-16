package com.vivek.simplecalc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.vivek.simplecalc.service.ServeClient;




@RestController
@SessionAttributes("recents")
public class GetResult {

	@Autowired
	private ModelAndView commonView;
	
	@Autowired
	private ServeClient sc;
	
	@Autowired
	private RestTemplate rt;
	
	@RequestMapping("/")
	public ModelAndView getResult() {
		commonView.setViewName("index.jsp");
		return commonView;
	}
	
	@RequestMapping("*")
	public ModelAndView fallBackMethod() {
		return getResult();
	}
	
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("a") String a, @RequestParam("b") String b,HttpSession session){
		ModelAndView mAV=new ModelAndView();
		mAV.setViewName("index.jsp");
		String res=sc.add(a, b);
		mAV.addObject("result",res);
		Object recents=session.getAttribute("recents");
		if(res!=null)
		mAV.addObject("recents",a+" + "+b+" = " +res+"<br>"+(recents==null?"":recents));
		
		return mAV;
	}
	
	@RequestMapping("/subtract")
	public ModelAndView subtract(@RequestParam("a") String a, @RequestParam("b") String b,HttpSession session){
		ModelAndView mAV=new ModelAndView();
		mAV.setViewName("index.jsp");
		String res=sc.subtract(a, b);
		mAV.addObject("result",res);
		Object recents=session.getAttribute("recents");
		if(res!=null)
		mAV.addObject("recents",a+" - "+b+" = " +res+"<br>"+(recents==null?"":recents));
		return mAV;
	}
	
	@RequestMapping("/multiply")
	public ModelAndView multiply(@RequestParam("a") String a, @RequestParam("b") String b,HttpSession session){
		ModelAndView mAV=new ModelAndView();
		mAV.setViewName("index.jsp");
		String res=sc.multiply(a, b);
		mAV.addObject("result",res);
		Object recents=session.getAttribute("recents");
		if(res!=null)
		mAV.addObject("recents",a+" * "+b+" = " +res+"<br>"+(recents==null?"":recents));
		return mAV;
	}
	
	@RequestMapping("/divide")
	public ModelAndView divide(@RequestParam("a") String a, @RequestParam("b") String b, HttpSession session){
		ModelAndView mAV=new ModelAndView();
		mAV.setViewName("index.jsp");
		String res=sc.divide(a, b);
		mAV.addObject("result",res);
		Object recents=session.getAttribute("recents");
		if(res!=null)
		mAV.addObject("recents",a+" / "+b+" = " +res+"<br>"+(recents==null?"":recents));
		return mAV;
	}
	
	@RequestMapping("/expr")
	public ModelAndView expr(@RequestParam("expr") String expr, HttpSession session){
		ModelAndView mAV=new ModelAndView();
		mAV.setViewName("index.jsp");
		Object recents=session.getAttribute("recents");
		String res=sc.expr(expr, rt);
		mAV.addObject("result",res);
		mAV.addObject("recents",expr+" = "+res+"<br>"+(recents==null?"":recents));
		
		return mAV;
	}
	
	
}
