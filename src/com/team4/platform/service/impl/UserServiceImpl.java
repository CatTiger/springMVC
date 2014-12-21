package com.team4.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.team4.base.core.service.impl.BaseServiceImpl;
import com.team4.platform.dao.IBaseUserDao;

import com.team4.platform.service.IUserService;

@Service("iUserService")
@Transactional
public class UserServiceImpl extends BaseServiceImpl implements IUserService {
	
	@Autowired
	@Qualifier("iBaseUserDao")
	private IBaseUserDao userDao;
	
	public boolean isExist(String username) {
		if(userDao.findByUsername(username) == null)
			return false;
		else 
			return true;
	}
}
 