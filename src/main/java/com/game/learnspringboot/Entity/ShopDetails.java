package com.game.learnspringboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="shop_details")
public class ShopDetails {
	@Column(name="id")
	private long id;
	@Column(name="shop_name")
	private String shopName;
	@Column(name="shop_address")
	private String ShopAddress;
	@Column(name="latitude")
	private double latitude;
	@Column(name="logitude")
	private double longitude;
	@Column(name="emailId")
	private String emailId;
	@Column(name="phone")
	private long phoneNumber;
	@Column(name="logo")
	private String logo;
	@Column(name="created_at")
	private boolean createdAt;
	@Column(name="status")
	private boolean status;
	@Column(name="is_deleted")
	private boolean isDeleted;
	@Column(name="shop_type")
	private int shopType;
	public ShopDetails(long id, String shopName, String shopAddress, double latitude, double longitude, String emailId,
			long phoneNumber, String logo, boolean createdAt, boolean status, boolean isDeleted, int shopType) {
		super();
		this.id = id;
		this.shopName = shopName;
		ShopAddress = shopAddress;
		this.latitude = latitude;
		this.longitude = longitude;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.logo = logo;
		this.createdAt = createdAt;
		this.status = status;
		this.isDeleted = isDeleted;
		this.shopType = shopType;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopAddress() {
		return ShopAddress;
	}
	public void setShopAddress(String shopAddress) {
		ShopAddress = shopAddress;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public boolean isCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(boolean createdAt) {
		this.createdAt = createdAt;
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
	public int getShopType() {
		return shopType;
	}
	public void setShopType(int shopType) {
		this.shopType = shopType;
	}
	@Override
	public String toString() {
		return "ShopDetails [id=" + id + ", shopName=" + shopName + ", ShopAddress=" + ShopAddress + ", latitude="
				+ latitude + ", longitude=" + longitude + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber
				+ ", logo=" + logo + ", createdAt=" + createdAt + ", status=" + status + ", isDeleted=" + isDeleted
				+ ", shopType=" + shopType + "]";
	}
}