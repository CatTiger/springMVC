package com.team4.base.core.dao.impl;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.base.core.dao.IBaseModelDao;
import com.team4.base.core.exception.AppException;
import com.team4.base.core.model.BaseModel;
import com.team4.platform.model.BaseUser;

@Repository("iBaseModelDao")
public class BaseModelDaoImpl implements IBaseModelDao {

	@Autowired
	protected SessionFactory sessionFactory;

	/**
	 * to be continue
	 * 
	 * @param baseModel
	 * @return
	 */
	public <T extends BaseModel> String getSearchStr(T baseModel) {
		String searchStr = "";
		Class<? extends BaseModel> cls = baseModel.getClass();
		Field[] fields = cls.getFields();
		for (Field field : fields) {
			field.getName();
		}
		return searchStr;
	}

	private <T extends BaseModel> String getModelName(T baseModel) {
		String fullName = baseModel.getClass().getName();
		return fullName.substring(fullName.lastIndexOf("."), fullName.length());
	}

	public <T extends BaseModel> void insert(T baseModel) throws AppException {
		sessionFactory.getCurrentSession().save(baseModel);
	}

	public <T extends BaseModel> void deleteByModel(T baseModel)
			throws AppException {
		sessionFactory.getCurrentSession().delete(baseModel);
	}

	public <T extends BaseModel> Integer count(T baseModel) throws AppException {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from " + getModelName(baseModel);
		Integer count = (Integer) session.createQuery(hql).iterate().next();
		return count;
	}

	public <T extends BaseModel> List<T> search(T baseModel)
			throws AppException {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from " + getModelName(baseModel);
		return session.createQuery(hql).list();
	}

	public <T extends BaseModel> List<T> search(T baseModel,
			Integer startIndex, Integer pageRows) throws AppException {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from " + getModelName(baseModel));
		q.setFirstResult(startIndex);
		q.setMaxResults(pageRows);
		return q.list();
	}

	public <T extends BaseModel> void update(T baseModel) throws AppException {
		sessionFactory.getCurrentSession().update(baseModel);
	}

	public <T extends BaseModel> T searchById(String id, T baseModel)
			throws AppException {
		Session session = sessionFactory.getCurrentSession();
		BaseModel model = (BaseModel) session.get(baseModel.getClass(), id);
		return (T) model;
	}

	/**
	 * to be continue
	 * 
	 * @param baseModel
	 * @return
	 */
	public <T extends BaseModel> List<T> searchByIds(String clsName, String ids)
			throws AppException {
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("from " + clsName + "where id in" + ids).list();
		return null;
	}

}
