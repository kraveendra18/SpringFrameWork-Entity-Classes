package com.game.learnspringboot.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="gift_cards")
public class GiftCards {
	@Column(name="id")
	private int id;
	@Column(name="created_by")
	private long createdBy;
	@Column(name="gift_long")
	private long giftLong;
	@Column(name="gift_percantage")
	private float giftPercantage;
	@Column(name="is_amount")
	private int isAmount;
	@Column(name="is_giftpercentage")
	private int isGiftpercentage;
	@Column(name="gift_code")
	private String giftCode;
	@Column(name="start_date")
	private LocalDate startDate;
	@Column(name="end_date")
	private LocalDate endDate;
	@Column(name="status")
	private boolean status;
	@Column(name="is_deleted")
	private boolean isDeleted;
	@Column(name="shop_list")
	private int shopList;
	public GiftCards(int id, long createdBy, long giftLong, float giftPercantage, int isAmount, int isGiftpercentage,
			String giftCode, LocalDate startDate, LocalDate endDate, boolean status, boolean isDeleted, int shopList) {
		super();
		this.id = id;
		this.createdBy = createdBy;
		this.giftLong = giftLong;
		this.giftPercantage = giftPercantage;
		this.isAmount = isAmount;
		this.isGiftpercentage = isGiftpercentage;
		this.giftCode = giftCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.isDeleted = isDeleted;
		this.shopList = shopList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}
	public long getGiftLong() {
		return giftLong;
	}
	public void setGiftLong(long giftLong) {
		this.giftLong = giftLong;
	}
	public float getGiftPercantage() {
		return giftPercantage;
	}
	public void setGiftPercantage(float giftPercantage) {
		this.giftPercantage = giftPercantage;
	}
	public int getIsAmount() {
		return isAmount;
	}
	public void setIsAmount(int isAmount) {
		this.isAmount = isAmount;
	}
	public int getIsGiftpercentage() {
		return isGiftpercentage;
	}
	public void setIsGiftpercentage(int isGiftpercentage) {
		this.isGiftpercentage = isGiftpercentage;
	}
	public String getGiftCode() {
		return giftCode;
	}
	public void setGiftCode(String giftCode) {
		this.giftCode = giftCode;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
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
	public int getShopList() {
		return shopList;
	}
	public void setShopList(int shopList) {
		this.shopList = shopList;
	}
	@Override
	public String toString() {
		return "GiftCards [id=" + id + ", createdBy=" + createdBy + ", giftLong=" + giftLong + ", giftPercantage="
				+ giftPercantage + ", isAmount=" + isAmount + ", isGiftpercentage=" + isGiftpercentage + ", giftCode="
				+ giftCode + ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status + ", isDeleted="
				+ isDeleted + ", shopList=" + shopList + "]";
	}
}