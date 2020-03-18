package com.bj.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	public static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	 
	@GetMapping("/hello/{name}")
	@ResponseBody
	public String sayHello(@PathVariable("name") String userName){
		logger.debug("sayHello:" + userName);
		return "hello " + userName;
	}
	
	
	@GetMapping("/hello")
	public String hello(){
		logger.debug("sayHello: HTML");
		return "emp/empinfo";
	}
	
	@GetMapping("/hello1")
	public String hello1(){
		logger.debug("sayHello: HTML");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/emps");;
		return "redirect:/emps";
	}
}
