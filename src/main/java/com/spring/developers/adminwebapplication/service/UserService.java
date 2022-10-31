package com.spring.developers.adminwebapplication.service;

import org.springframework.stereotype.Service;

import com.spring.developers.adminwebapplication.model.UserInfo;

@Service
public interface UserService {
	public UserInfo getUserDetails(UserInfo userInfo);
}
