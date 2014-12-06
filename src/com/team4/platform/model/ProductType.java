package com.team4.platform.model;

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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.team4.base.core.model.BaseModel;

@Entity
@Table(schema = "TRAIN",name = "product_type")
public class ProductType extends BaseModel implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "product_type_id")
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	private String productTypeId;

	@Column(name = "type_id")
	private Integer typeId;

	@Column(name = "type_name")
	private String typeName;

	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(name = "product_type_map",
	joinColumns = {@JoinColumn(name = "product_type_id", referencedColumnName = "product_type_id")},
	inverseJoinColumns = {@JoinColumn(name = "user_product_id", referencedColumnName ="user_product_id")})
	private Set<UserProduct> userProducts = new HashSet<UserProduct>();

	public ProductType() {
	}

	public ProductType(String productTypeId) {
		this.productTypeId = productTypeId;
	}

	public String getProductTypeId() {
		return this.productTypeId;
	}

	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Set<UserProduct> getUserProducts() {
		return userProducts;
	}

	public void setUserProducts(Set<UserProduct> userProducts) {
		this.userProducts = userProducts;
	}

}
