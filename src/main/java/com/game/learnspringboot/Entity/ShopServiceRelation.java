package com.game.learnspringboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shop_service_relation")
public class ShopServiceRelation {
	@Id
	@Column(name="id")
	private long id;
	@Column(name="shop_id")
	private int shopId;
	@Column(name="service_id")
	private int serviceId;
	@Column(name="status")
	private boolean status;
	@Column(name="is_deleted")
	private boolean isDeleted;
	@Column(name="price")
	private int price;
	public ShopServiceRelation(long id, int shopId, int serviceId, boolean status, boolean isDeleted, int price) {
		super();
		this.id = id;
		this.shopId = shopId;
		this.serviceId = serviceId;
		this.status = status;
		this.isDeleted = isDeleted;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ShopServiceRelation [id=" + id + ", shopId=" + shopId + ", serviceId=" + serviceId + ", status="
				+ status + ", isDeleted=" + isDeleted + ", price=" + price + "]";
	}
}