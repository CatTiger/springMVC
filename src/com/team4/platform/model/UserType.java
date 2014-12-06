package com.team4.platform.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.team4.base.core.model.BaseModel;

@Entity                        // 表示为实体类
@Table(name="user_type")       // 表名注解
public class UserType extends BaseModel implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id  
    @Column(name="user_type_id")  
	@GeneratedValue(generator = "paymentableGenerator")     
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	private String userTypeId;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
	private BaseUser baseUser;
	
	@Column(name = "user_type")
	private String userType;

	public UserType() {
	}

	public UserType(String userTypeId, BaseUser baseUser) {
		this.userTypeId = userTypeId;
		this.baseUser = baseUser;
	}

	public UserType(String userTypeId, BaseUser baseUser, String userType) {
		this.userTypeId = userTypeId;
		this.baseUser = baseUser;
		this.userType = userType;
	}

	public String getUserTypeId() {
		return this.userTypeId;
	}

	public void setUserTypeId(String userTypeId) {
		this.userTypeId = userTypeId;
	}

	public BaseUser getBaseUser() {
		return this.baseUser;
	}

	public void setBaseUser(BaseUser baseUser) {
		this.baseUser = baseUser;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}
