package com.team4.platform.dao;

import com.team4.base.core.dao.IBaseModelDao;

public interface IBaseUserDao extends IBaseModelDao {
	
	public com.team4.platform.model.BaseUser findByUsername(String username);
}
