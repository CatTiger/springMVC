package com.team4.platform.model;

import com.team4.base.core.model.BaseModel;



public class ProductTypeMap extends BaseModel implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productTypeTypeId;
	
	
	private UserProduct userProduct;
	
	
	private ProductType productType;

	public ProductTypeMap() {
	}

	public ProductTypeMap(String productTypeTypeId) {
		this.productTypeTypeId = productTypeTypeId;
	}

	public ProductTypeMap(String productTypeTypeId, UserProduct userProduct,
			ProductType productType) {
		this.productTypeTypeId = productTypeTypeId;
		this.userProduct = userProduct;
		this.productType = productType;
	}

	public String getProductTypeTypeId() {
		return this.productTypeTypeId;
	}

	public void setProductTypeTypeId(String productTypeTypeId) {
		this.productTypeTypeId = productTypeTypeId;
	}

	public UserProduct getUserProduct() {
		return this.userProduct;
	}

	public void setUserProduct(UserProduct userProduct) {
		this.userProduct = userProduct;
	}

	public ProductType getProductType() {
		return this.productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

}
