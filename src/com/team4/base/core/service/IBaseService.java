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

	public int deleteById(String clsName, Long id) throws AppException;

	public int deleteById(Long id) throws AppException;

	public int deleteByIds(String ids) throws AppException;

	public int deleteByIds(String clsName, String ids) throws AppException;

	public <T extends BaseModel> int update(T baseModel,
			Map<String, String> params) throws AppException;

	public <T extends BaseModel> int update(T baseModel, String ids)
			throws AppException;

	public <T extends BaseModel> T searchById(String clsName, Long id)
			throws AppException;

	public <T extends BaseModel> T searchById(Long id) throws AppException;

	public <T extends BaseModel> List<T> searchByIds(String cls, String ids)
			throws AppException;

	public <T extends BaseModel> SearchResult search(T baseModel,
			int pageIndex, int pageRows) throws AppException;

	public <T extends BaseModel> SearchResult searchCross(T baseModel,
			int pageIndex, int pageRows) throws AppException;

	public <T extends BaseModel> Integer count(T baseModel) throws AppException;

	public <T extends BaseModel> Integer countCross(T baseModel)
			throws AppException;

	public <T extends BaseModel> Integer countByModel(T baseModel)
			throws AppException;

	public int validate(String clsName, String ids) throws AppException;

	public int examine(String clsName, String ids) throws AppException;

	public int invalidate(String clsName, String ids) throws AppException;

	public int unexamine(String clsName, String ids) throws AppException;

	public <T extends BaseModel> Integer countByModelVerificate(T baseModel)
			throws AppException;

}
