package com.dexian.spring.springmvcorm.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dexian.spring.springmvcorm.user.dao.UserDAO;
import com.dexian.spring.springmvcorm.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public int save(User user) {
		return userDAO.create(user);
	}
	
	
}
