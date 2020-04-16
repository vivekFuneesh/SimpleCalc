package com.vivek.simplecalc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Configuration
@ComponentScan({"com.vivek.simplecalc.service","com.vivek.simplecalc.controller"})
public class MainConfig {

	@Bean
	public ModelAndView modelAndView() {
		return new ModelAndView();
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
}
