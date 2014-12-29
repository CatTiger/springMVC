package com.team4.platform.dao.impl;

import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;

import com.team4.base.core.dao.impl.BaseModelDaoImpl;

import com.team4.platform.dao.IBaseUserDao;

@Repository("iBaseUserDao")
public class BaseUserDaoImpl extends BaseModelDaoImpl implements IBaseUserDao {
	
	private static String FIND_BY_USERNAME = "from BaseUser where username=?";

	public com.team4.platform.model.BaseUser findByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery(FIND_BY_USERNAME).setString(0, username);
		return (com.team4.platform.model.BaseUser)q.uniqueResult();
	}
	
}
