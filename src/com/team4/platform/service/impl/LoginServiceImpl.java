package com.team4.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.team4.base.core.service.impl.BaseServiceImpl;
import com.team4.platform.dao.impl.BaseUserDaoImpl;
import com.team4.platform.service.ILoginService;

@Service("iLoginService")
@Transactional
@EnableTransactionManagement
public class LoginServiceImpl extends BaseServiceImpl implements ILoginService {
	
	

}
 