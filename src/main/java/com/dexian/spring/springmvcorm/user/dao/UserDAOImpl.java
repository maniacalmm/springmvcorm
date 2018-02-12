package com.dexian.spring.springmvcorm.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dexian.spring.springmvcorm.user.entity.User;

@Repository
@Component
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public int create(User user) {
		return (Integer) ht.save(user);
	}
	
}
