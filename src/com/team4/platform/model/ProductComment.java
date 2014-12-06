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
@Table(name = "product_comment")
public class ProductComment extends BaseModel implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "comment_id")
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	private String commentId;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
	private BaseUser baseUser;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "user_product_id")
	private UserProduct userProduct;
	
	@Column(name = "comment_detail")
	private String commentDetail;
	
	@Column(name = "comment_time")
	private Date commentTime;

	public ProductComment() {
	}

	public ProductComment(String commentId, String commentDetail,
			Date commentTime) {
		this.commentId = commentId;
		this.commentDetail = commentDetail;
		this.commentTime = commentTime;
	}

	public ProductComment(String commentId, BaseUser baseUser,
			UserProduct userProduct, String commentDetail, Date commentTime) {
		this.commentId = commentId;
		this.baseUser = baseUser;
		this.userProduct = userProduct;
		this.commentDetail = commentDetail;
		this.commentTime = commentTime;
	}

	public String getCommentId() {
		return this.commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
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

	public String getCommentDetail() {
		return this.commentDetail;
	}

	public void setCommentDetail(String commentDetail) {
		this.commentDetail = commentDetail;
	}

	public Date getCommentTime() {
		return this.commentTime;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

}
