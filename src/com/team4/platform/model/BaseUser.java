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

@Entity                        // 表示为实体类
@Table(name="base_user")       // 表名注解
public class BaseUser implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id  
    @Column(name="user_id")  
	@GeneratedValue(generator = "paymentableGenerator")     
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	private String userId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="pwd")
	private String pwd;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telphone")
	private String telphone;
	
	@Column(name="contact_name")
	private String contactName;
	
	@Column(name="regist_time")
	private Date registTime;
	
	@Column(name="contact_address")
	private String contactAddress;
	
	@Column(name="user_big_img")
	private byte[] userBigImg;
	
	@Column(name="user_small_img")
	private byte[] userSmallImg;
	
	@Column(name="user_qq")
	private String userQq;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "baseUser")
	private Set<UserProductStore> userProductStores = new HashSet<UserProductStore>();
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "baseUser")
	private Set<UserProduct> userProducts = new HashSet<UserProduct>();
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy = "baseUser")
	private Set<UserType> userTypes = new HashSet<UserType>();
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "baseUser")
	private Set<ProductComment> productComments = new HashSet<ProductComment>();

	public BaseUser() {
	}

	public BaseUser(String userId, String username, String pwd, String email,
			String telphone, Date registTime, String contactAddress) {
		this.userId = userId;
		this.username = username;
		this.pwd = pwd;
		this.email = email;
		this.telphone = telphone;
		this.registTime = registTime;
		this.contactAddress = contactAddress;
	}

	public BaseUser(String userId, String username, String pwd, String email,
			String telphone, String contactName, Date registTime,
			String contactAddress, byte[] userBigImg, byte[] userSmallImg,
			String userQq, Set userProductStores, Set userProducts,
			Set userTypes, Set productComments) {
		this.userId = userId;
		this.username = username;
		this.pwd = pwd;
		this.email = email;
		this.telphone = telphone;
		this.contactName = contactName;
		this.registTime = registTime;
		this.contactAddress = contactAddress;
		this.userBigImg = userBigImg;
		this.userSmallImg = userSmallImg;
		this.userQq = userQq;
		this.userProductStores = userProductStores;
		this.userProducts = userProducts;
		this.userTypes = userTypes;
		this.productComments = productComments;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelphone() {
		return this.telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Date getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	public String getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public byte[] getUserBigImg() {
		return this.userBigImg;
	}

	public void setUserBigImg(byte[] userBigImg) {
		this.userBigImg = userBigImg;
	}

	public byte[] getUserSmallImg() {
		return this.userSmallImg;
	}

	public void setUserSmallImg(byte[] userSmallImg) {
		this.userSmallImg = userSmallImg;
	}

	public String getUserQq() {
		return this.userQq;
	}

	public void setUserQq(String userQq) {
		this.userQq = userQq;
	}

	public Set getUserProductStores() {
		return this.userProductStores;
	}

	public void setUserProductStores(Set userProductStores) {
		this.userProductStores = userProductStores;
	}

	public Set getUserProducts() {
		return this.userProducts;
	}

	public void setUserProducts(Set userProducts) {
		this.userProducts = userProducts;
	}

	public Set getUserTypes() {
		return this.userTypes;
	}

	public void setUserTypes(Set userTypes) {
		this.userTypes = userTypes;
	}

	public Set getProductComments() {
		return this.productComments;
	}

	public void setProductComments(Set productComments) {
		this.productComments = productComments;
	}

}
