package com.team4.base.core.service.impl;

import java.util.List;
import java.util.Map;

import javax.naming.directory.SearchResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team4.base.core.dao.IBaseModelDao;
import com.team4.base.core.exception.AppException;
import com.team4.base.core.model.BaseModel;
import com.team4.base.core.service.IBaseService;

@Service
@Transactional
public class BaseServiceImpl implements IBaseService {
	
	@Autowired
	@Qualifier("iBaseModelDao")
	private IBaseModelDao iBaseModelDao;

	public <T extends BaseModel> T insert(T baseModel) throws AppException {
		iBaseModelDao.insert(baseModel);
		return null;
	}

	public int deleteById(String clsName, Long id) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteById(Long id) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByIds(String ids) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByIds(String clsName, String ids) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends BaseModel> int update(T baseModel,
			Map<String, String> params) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends BaseModel> int update(T baseModel, String ids)
			throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends BaseModel> T searchById(String clsName, Long id)
			throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends BaseModel> T searchById(Long id) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends BaseModel> List<T> searchByIds(String cls, String ids)
			throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends BaseModel> SearchResult search(T baseModel,
			int pageIndex, int pageRows) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends BaseModel> SearchResult searchCross(T baseModel,
			int pageIndex, int pageRows) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends BaseModel> Integer count(T baseModel) throws AppException {
		// TODO Auto-generated method stub
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

	public int validate(String clsName, String ids) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int examine(String clsName, String ids) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int invalidate(String clsName, String ids) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int unexamine(String clsName, String ids) throws AppException {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends BaseModel> Integer countByModelVerificate(T baseModel)
			throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

}
