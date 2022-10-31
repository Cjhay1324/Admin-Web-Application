package com.spring.developers.adminwebapplication.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
	
	private static final Logger LOGGER = LogManager.getLogger(ViewController.class);
	
	@GetMapping(value = { "/", "/index" })
	public ModelAndView index() {
		
		LOGGER.info("Sample Logs");
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("views/index");
		return modelAndView;
	}
	
	@GetMapping(value = { "/loading" })
	public ModelAndView loading() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("ui-elements/loading");
		return modelAndView;
	}
	
	@GetMapping(value = { "/login" })
	public ModelAndView login() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("ui-elements/login");
		return modelAndView;
	}
}
