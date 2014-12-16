package com.team4.base.core.service;

import java.util.List;
import java.util.Map;

import javax.naming.directory.SearchResult;

import com.team4.base.core.exception.AppException;
import com.team4.base.core.model.BaseModel;

/**
 * 
 * @author {guozichen} 2014Äê11ÔÂ4ÈÕ
 */
public interface IBaseService {

	public <T extends BaseModel> T insert(T baseModel) throws AppException;

	public <T extends BaseModel> void deleteModel(T baseModel)
			throws AppException;

	public <T extends BaseModel> void deleteModels(List<T> baseModels)
			throws AppException;

	public <T extends BaseModel> void update(T baseModel) throws AppException;

	public <T extends BaseModel> T searchById(String uuid, String clsName) throws AppException;

	public <T extends BaseModel> List<T> searchByIds(String cls, String ids)
			throws AppException;

	public <T extends BaseModel> Integer count(T baseModel) throws AppException;

}
