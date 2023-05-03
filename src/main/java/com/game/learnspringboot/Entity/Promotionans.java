package com.game.learnspringboot.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="promotionans")
public class Promotionans {
@Id
@Column(name="id")
private long id;
@Column(name="shop_id")
private String shopId;
@Column(name="is_percantage")
private float isPercantage;
@Column(name="is_amount")
private int isAmount;
@Column(name="percentage_value")
private long percentageValue;
@Column(name="amount_value")
private long amountValue;
@Column(name="start_date")
private LocalDate startDate;
@Column(name="end_date")
private LocalDate endDate;
@Column(name="promotion_name")
private String promotionName;
@Column(name="min_service_count")
private int minServiceCount;
public Promotionans(long id, String shopId, float isPercantage, int isAmount, long percentageValue, long amountValue,
		LocalDate startDate, LocalDate endDate, String promotionName, int min_serviceCount) {
	super();
	this.id = id;
	this.shopId = shopId;
	this.isPercantage = isPercantage;
	this.isAmount = isAmount;
	this.percentageValue = percentageValue;
	this.amountValue = amountValue;
	this.startDate = startDate;
	this.endDate = endDate;
	this.promotionName = promotionName;
	this.minServiceCount = minServiceCount;
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
public float getIsPercantage() {
	return isPercantage;
}
public void setIsPercantage(float isPercantage) {
	this.isPercantage = isPercantage;
}
public int getIsAmount() {
	return isAmount;
}
public void setIsAmount(int isAmount) {
	this.isAmount = isAmount;
}
public long getPercentageValue() {
	return percentageValue;
}
public void setPercentageValue(long percentageValue) {
	this.percentageValue = percentageValue;
}
public long getAmountValue() {
	return amountValue;
}
public void setAmountValue(long amountValue) {
	this.amountValue = amountValue;
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
public String getPromotionName() {
	return promotionName;
}
public void setPromotionName(String promotionName) {
	this.promotionName = promotionName;
}
public int getMinServiceCount() {
	return minServiceCount;
}
public void setMinServiceCount(int min_serviceCount) {
	this.minServiceCount = min_serviceCount;
}
@Override
public String toString() {
	return "Promotionans [id=" + id + ", shopId=" + shopId + ", isPercantage=" + isPercantage + ", isAmount=" + isAmount
			+ ", percentageValue=" + percentageValue + ", amountValue=" + amountValue + ", startDate=" + startDate
			+ ", endDate=" + endDate + ", promotionName=" + promotionName + ", minServiceCount=" + minServiceCount
			+ "]";
}
}