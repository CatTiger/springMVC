package com.team4.platform.service;

import com.team4.base.core.service.IBaseService;

/**
 * �û�ע�����½
 * @author {guozichen}
 * 2014��11��27��
 */
public interface IUserService extends IBaseService {

	public boolean isExist(String username);
}
