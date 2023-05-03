package com.game.learnspringboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shop_ratings")
public class ShopRatings {
	@Id
	@Column(name="id")
	private long id;
	@Column(name="shop_id")
	private String shopId;
	@Column(name="consumer_id")
	private String consumerId;
	@Column(name="ratings")
	private float ratings;
	@Column(name="comments")
	private String comments;
	public ShopRatings(long id, String shopId, String consumerId, float ratings, String comments) {
		super();
		this.id = id;
		this.shopId = shopId;
		this.consumerId = consumerId;
		this.ratings = ratings;
		this.comments = comments;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "ShopRatings [id=" + id + ", shopId=" + shopId + ", consumerId=" + consumerId + ", ratings=" + ratings
				+ ", comments=" + comments + "]";
	}
}