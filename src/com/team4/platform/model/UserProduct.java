package com.team4.platform.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.team4.base.core.model.BaseModel;

@Entity
@Table(name = "user_product")
public class UserProduct extends BaseModel implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "user_product_id")
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	private String userProductId;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
	private BaseUser baseUser;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_price")
	private String productPrice;

	@Column(name = "product_detail")
	private String productDetail;

	@Column(name = "product_img")
	private byte[] productImg;

	@Column(name = "product_state")
	private int productState;

	@Column(name = "product_time")
	private Date productTime;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProduct")
	private Set<UserProductStore> userProductStores = new HashSet<UserProductStore>();

	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(name = "product_type_map",
	joinColumns = {@JoinColumn(name = "user_product_id", referencedColumnName = "user_product_id")},
	inverseJoinColumns = {@JoinColumn(name = "product_type_id", referencedColumnName ="product_type_id")})
	private Set<ProductType> productTypes = new HashSet<ProductType>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProduct")
	private Set<ProductComment> productComments = new HashSet<ProductComment>();

	public UserProduct() {
	}


	public String getUserProductId() {
		return this.userProductId;
	}

	public void setUserProductId(String userProductId) {
		this.userProductId = userProductId;
	}

	public BaseUser getBaseUser() {
		return this.baseUser;
	}

	public void setBaseUser(BaseUser baseUser) {
		this.baseUser = baseUser;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDetail() {
		return this.productDetail;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	public byte[] getProductImg() {
		return this.productImg;
	}

	public void setProductImg(byte[] productImg) {
		this.productImg = productImg;
	}

	public int getProductState() {
		return this.productState;
	}

	public void setProductState(int productState) {
		this.productState = productState;
	}

	public Date getProductTime() {
		return this.productTime;
	}

	public void setProductTime(Date productTime) {
		this.productTime = productTime;
	}

	public Set getUserProductStores() {
		return this.userProductStores;
	}

	public Set<ProductType> getProductTypes() {
		return productTypes;
	}

	public void setProductTypes(Set<ProductType> productTypes) {
		this.productTypes = productTypes;
	}


}
