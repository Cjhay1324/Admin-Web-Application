package com.spring.developers.adminwebapplication.dao;

import org.springframework.stereotype.Component;

import com.spring.developers.adminwebapplication.model.UserInfo;

@Component
public interface UserDao {
	public UserInfo getUserDetails(UserInfo userInfo);
}
