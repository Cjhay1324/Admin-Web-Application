package com.spring.developers.adminwebapplication.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.developers.adminwebapplication.dao.UserDao;
import com.spring.developers.adminwebapplication.dao.impl.UserDaoImpl;
import com.spring.developers.adminwebapplication.model.UserInfo;
import com.spring.developers.adminwebapplication.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger LOGGER = LogManager.getLogger(UserService.class);
	
	@Autowired
	private UserDaoImpl userDaoImpl;
	
	@Override
	public UserInfo getUserDetails(UserInfo userInfo) {
		return userDaoImpl.getUserDetails(userInfo);
	}

}
