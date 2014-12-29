package com.team4.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.team4.base.core.service.impl.BaseServiceImpl;
import com.team4.platform.dao.IBaseUserDao;
import com.team4.platform.model.BaseUser;
import com.team4.platform.service.IUserService;

@Service("iUserService")
@Transactional
public class UserServiceImpl extends BaseServiceImpl implements IUserService {
	
	@Autowired
	@Qualifier("iBaseUserDao")
	private IBaseUserDao userDao;
	
	public boolean isExist(String username) {
		return userDao.findByUsername(username) == null ? false :true; 
	}

	public BaseUser getUserByUserName(String username) {
		// TODO Auto-generated method stub
		return userDao.findByUsername(username);
	}

	
}
 