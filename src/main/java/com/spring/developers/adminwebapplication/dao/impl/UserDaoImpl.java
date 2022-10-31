package com.spring.developers.adminwebapplication.dao.impl;

import java.util.Map;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.developers.adminwebapplication.dao.UserDao;
import com.spring.developers.adminwebapplication.model.UserInfo;

@Component
public class UserDaoImpl implements UserDao {
	
	private static final Logger LOGGER = LogManager.getLogger(UserDaoImpl.class);

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public UserInfo getUserDetails(UserInfo userInfo) {
		try {
			LOGGER.info("GET UserDetails --> getUserDetails()");
			
			Map<String, Object> map = new HashMap<>();
			map.put("userName", userInfo.getUserName());
			map.put("passWord", userInfo.getPassWord());
			
			LOGGER.info("GET UserDetails --> map: " + map);
			
			return null;
			
//			return sqlSessionTemplate.selectOne("getUsersDetails", map);
		} catch (Exception e) {
			LOGGER.error(e.toString());
		}
		return null;
	}
}
