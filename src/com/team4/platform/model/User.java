package com.team4.platform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.team4.base.core.model.BaseModel;

@Entity
@Table(name = "user", catalog = "user")
public class User extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8062568363513455383L;

	@Column(name="name",nullable=false,columnDefinition="char") 
	private String name;
	
	@Column(name="pwd",nullable=false,columnDefinition="char")
	private String pwd;
	
	@Column(name="sex",nullable=false)
	private Integer sex;
	
	@Column(name="telphoneNum",nullable=true,columnDefinition="char")
	private String telphoneNum;
	
	@Column(name="email",nullable=true,columnDefinition="char")
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getTelphoneNum() {
		return telphoneNum;
	}

	public void setTelphoneNum(String telphoneNum) {
		this.telphoneNum = telphoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
