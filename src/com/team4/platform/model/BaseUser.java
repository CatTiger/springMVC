package com.team4.platform.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.team4.base.core.model.BaseModel;

@Entity
@Table(name = "base_user")
public class BaseUser extends BaseModel implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_id")
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	private String userId;

	@Column(name = "username")
	private String username;

	@Column(name = "pwd")
	private String pwd;

	@Column(name = "email")
	private String email;

	@Column(name = "telphone")
	private String telphone;

	@Column(name = "contact_name")
	private String contactName;

	@Column(name = "regist_time")
	private Date registTime;

	@Column(name = "contact_address")
	private String contactAddress;

	@Column(name = "user_big_img")
	private byte[] userBigImg;

	@Column(name = "user_small_img")
	private byte[] userSmallImg;

	@Column(name = "user_qq")
	private String userQq;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "baseUser")
	private Set<UserProductStore> userProductStores = new HashSet<UserProductStore>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "baseUser")
	private Set<UserProduct> userProducts = new HashSet<UserProduct>();

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "baseUser")
	private Set<UserType> userTypes = new HashSet<UserType>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "baseUser")
	private Set<ProductComment> productComments = new HashSet<ProductComment>();

	public BaseUser() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Date getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public byte[] getUserBigImg() {
		return userBigImg;
	}

	public void setUserBigImg(byte[] userBigImg) {
		this.userBigImg = userBigImg;
	}

	public byte[] getUserSmallImg() {
		return userSmallImg;
	}

	public void setUserSmallImg(byte[] userSmallImg) {
		this.userSmallImg = userSmallImg;
	}

	public String getUserQq() {
		return userQq;
	}

	public void setUserQq(String userQq) {
		this.userQq = userQq;
	}

	public Set<UserProductStore> getUserProductStores() {
		return userProductStores;
	}

	public void setUserProductStores(Set<UserProductStore> userProductStores) {
		this.userProductStores = userProductStores;
	}

	public Set<UserProduct> getUserProducts() {
		return userProducts;
	}

	public void setUserProducts(Set<UserProduct> userProducts) {
		this.userProducts = userProducts;
	}

	public Set<UserType> getUserTypes() {
		return userTypes;
	}

	public void setUserTypes(Set<UserType> userTypes) {
		this.userTypes = userTypes;
	}

	public Set<ProductComment> getProductComments() {
		return productComments;
	}

	public void setProductComments(Set<ProductComment> productComments) {
		this.productComments = productComments;
	}

}
