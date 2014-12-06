package com.team4.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team4.base.core.service.impl.BaseServiceImpl;
import com.team4.platform.dao.IBaseUserDao;
import com.team4.platform.service.IUserService;

@Service("iUserService")
@Transactional
public class UserServiceImpl extends BaseServiceImpl implements IUserService {
	
	@Autowired
	private IBaseUserDao iBaseUserDao;
	
	
	
	
	
	

}
 