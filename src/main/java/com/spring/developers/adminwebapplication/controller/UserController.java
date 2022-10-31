package com.spring.developers.adminwebapplication.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.developers.adminwebapplication.model.UserInfo;
import com.spring.developers.adminwebapplication.service.UserService;
import com.spring.developers.adminwebapplication.service.impl.UserServiceImpl;

@Controller
public class UserController {
	
	private static final Logger LOGGER = LogManager.getLogger(UserController.class);
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping(value = { "/user/userAuthentication" })
	public ModelAndView userAuthentication(@RequestBody String userName, @RequestBody String passWord) {
		
		UserInfo user_param = new UserInfo();
		
		user_param.setUserName(userName);
		user_param.setPassWord(passWord);
		
		UserInfo user = userServiceImpl.getUserDetails(user_param);
		
		LOGGER.info("GetUser Details: " + user );
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("views/home");
		return modelAndView;
	}
	
	@GetMapping(value = { "/user/userAuthentication/userName={userName}&passWord={passWord}" })
	public ModelAndView userAuthentication2(@PathVariable String userName, @PathVariable String passWord) {
		
		UserInfo user_param = new UserInfo();
		
		user_param.setUserName(userName);
		user_param.setPassWord(passWord);
		
		UserInfo user = userServiceImpl.getUserDetails(user_param);
		
		LOGGER.info("GetUser Details: " + user );
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("views/home");
		return modelAndView;
	}
}
