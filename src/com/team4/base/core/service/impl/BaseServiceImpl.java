package com.team4.base.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.team4.base.core.dao.IBaseModelDao;
import com.team4.base.core.exception.AppException;
import com.team4.base.core.model.BaseModel;
import com.team4.base.core.service.IBaseService;
import com.team4.base.core.util.Constants;

@Service("iBaseService")
@Transactional
@EnableTransactionManagement
@ComponentScan(basePackages = "com.team4.base.core.service")
public class BaseServiceImpl implements IBaseService {

	@Autowired
	@Qualifier("iBaseModelDao")
	private IBaseModelDao iBaseModelDao;

	@Transactional
	public <T extends BaseModel> T insert(T baseModel) throws AppException {
		iBaseModelDao.insert(baseModel);
		return null;
	}

	@Transactional
	public <T extends BaseModel> void deleteModel(T baseModel)
			throws AppException {
		iBaseModelDao.deleteByModel(baseModel);
	}

	@Transactional
	public <T extends BaseModel> void deleteModels(List<T> baseModels)
			throws AppException {
		for (T t : baseModels) {
			iBaseModelDao.deleteByModel(t);
		}
	}

	@Transactional
	public <T extends BaseModel> void update(T baseModel) throws AppException {
		iBaseModelDao.update(baseModel);
	}

	@Transactional
	public <T extends BaseModel> T searchById(String uuid, T baseModel)
			throws AppException {
		return iBaseModelDao.searchById(uuid, baseModel);
	}

	@Transactional
	public <T extends BaseModel> List<T> searchByIds(List<String> ids, T baseModel)
			throws AppException {
		List<BaseModel> lists = new ArrayList<BaseModel>();
		for (String id : ids) {
			lists.add(iBaseModelDao.searchById(id, baseModel));
		}
		return (List<T>) lists;
	}

	public <T extends BaseModel> Integer count(T baseModel) throws AppException {
		return iBaseModelDao.count(baseModel);
	}

	/**
	 * get totalPage number
	 * @param baseModel
	 * @return
	 * @throws AppException
	 */
	public <T extends BaseModel> Integer getTotalPage(T baseModel) throws AppException {
		int totalRow = iBaseModelDao.count(baseModel);
		int totalPage = (int) Math.ceil((double)totalRow / (double)Constants.PAGE_SIZE);
		return Integer.valueOf(totalPage); 
	}
	
	public <T extends BaseModel> List<T> getPageResult(T baseModel, int pageIndex)
			throws AppException {
		int startIndex = (pageIndex - 1) * Constants.PAGE_SIZE;
		return iBaseModelDao.search(baseModel, startIndex, Constants.PAGE_SIZE);
	}

}
