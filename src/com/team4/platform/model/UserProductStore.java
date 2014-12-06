package com.team4.platform.model;


import java.util.Date;

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

@Entity
@Table(name = "user_product_store")
public class UserProductStore extends BaseModel implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "user_product_store_id")
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	private String userProductStoreId;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
	private BaseUser baseUser;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "user_product_id")
	private UserProduct userProduct;
	
	@Column(name = "store_time")
	private Date storeTime;

	public UserProductStore() {
	}

	public UserProductStore(String userProductStoreId, Date storeTime) {
		this.userProductStoreId = userProductStoreId;
		this.storeTime = storeTime;
	}

	public UserProductStore(String userProductStoreId, BaseUser baseUser,
			UserProduct userProduct, Date storeTime) {
		this.userProductStoreId = userProductStoreId;
		this.baseUser = baseUser;
		this.userProduct = userProduct;
		this.storeTime = storeTime;
	}

	public String getUserProductStoreId() {
		return this.userProductStoreId;
	}

	public void setUserProductStoreId(String userProductStoreId) {
		this.userProductStoreId = userProductStoreId;
	}

	public BaseUser getBaseUser() {
		return this.baseUser;
	}

	public void setBaseUser(BaseUser baseUser) {
		this.baseUser = baseUser;
	}

	public UserProduct getUserProduct() {
		return this.userProduct;
	}

	public void setUserProduct(UserProduct userProduct) {
		this.userProduct = userProduct;
	}

	public Date getStoreTime() {
		return this.storeTime;
	}

	public void setStoreTime(Date storeTime) {
		this.storeTime = storeTime;
	}

}
