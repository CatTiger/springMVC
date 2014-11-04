package com.team4.base.core.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.team4.base.core.exception.AppException;
import com.team4.base.core.model.BaseModel;

/**
 * 基础Dao接口
 * @author {guozichen}
 * 2014年11月3日
 */
public interface IBaseModelDao {
	/**
	 * 
	 * @param baseModel
	 * @return
	 * @throws AppException
	 */
	public <T extends BaseModel> Integer count(T baseModel) throws AppException;
	
	public <T extends BaseModel> Integer countCross(T baseModel) throws AppException;

	public <T extends BaseModel> Integer countByModel(T baseModel) throws AppException;

	public <T extends BaseModel> List<T> search(T baseModel, Integer pageIndex, Integer pageRows) throws AppException;

	public <T extends BaseModel> List<T> searchCross(T baseModel, Integer pageIndex, Integer pageRows) throws AppException;

	public <T extends BaseModel> List<T> search(T baseModel) throws AppException;

	public <T extends BaseModel> T searchById(Long id) throws AppException;

	public <T extends BaseModel> List<T> searchByIds(String clsName,String ids) throws AppException;

	public <T extends BaseModel> int update(T baseModel) throws AppException;

	public <T extends BaseModel> int update(T baseModel, String ids) throws AppException;

	public <T extends BaseModel> int deleteById(Long id) throws AppException;

	public <T extends BaseModel> int deleteByIds(String ids) throws AppException;

	public <T extends BaseModel> void insert(T baseModel) throws AppException;

	public int validate(String ids) throws AppException;

	public int validate(String cls, String ids) throws AppException;

	public int examine(String cls, String ids) throws AppException;

	public int unexamine(String cls, String ids) throws AppException;

	public int invalidate(String ids) throws AppException;

	public int invalidate(String cls, String ids) throws AppException;

	public <T extends BaseModel> Integer countByModelVerificate(T baseModel) throws AppException;

}
