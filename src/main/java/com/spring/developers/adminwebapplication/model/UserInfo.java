package com.spring.developers.adminwebapplication.model;

import java.util.Date;

import lombok.Data;

@Data
public class UserInfo {
	private String userName;
	private String passWord;
	private String userRole;
	private Date createdDt;
}
