package com.team4.base.core.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.team4.base.core.dao.IBaseModelDao;
import com.team4.base.core.exception.AppException;
import com.team4.base.core.model.BaseModel;

@Repository("iBaseModelDao")
public class BaseModelDaoImpl implements IBaseModelDao {
	
	@Autowired
	protected SessionFactory sessionFactory;
	
	public <T extends BaseModel> Integer count(T baseModel) throws AppException {
		Session session = sessionFactory.getCurrentSession();
		session.save(baseModel);
		return null;
	}

	public <T extends BaseModel> Integer countCross(T baseModel)
			throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends BaseModel> Integer countByModel(T baseModel)
			throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends BaseModel> List<T> search(T baseModel, Integer pageIndex,
			Integer pageRows) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends BaseModel> List<T> searchCross(T baseModel,
			Integer pageIndex, Integer pageRows) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends BaseModel> List<T> search(T baseModel)
			throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends BaseModel> T searchById(Long id) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends BaseModel> List<T> searchByIds(String clsName, String ids)
			throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends BaseModel> int update(T baseModel) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends BaseModel> int update(T baseModel, String ids)
			throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends BaseModel> int deleteById(Long id) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends BaseModel> int deleteByIds(String ids)
			throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends BaseModel> void insert(T baseModel)
			throws AppException {
		Session session = sessionFactory.getCurrentSession();
		session.save(baseModel);
	}

	public int validate(String ids) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int validate(String cls, String ids) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int examine(String cls, String ids) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int unexamine(String cls, String ids) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int invalidate(String ids) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int invalidate(String cls, String ids) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends BaseModel> Integer countByModelVerificate(T baseModel)
			throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

}
