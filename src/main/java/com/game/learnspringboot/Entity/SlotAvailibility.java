package com.game.learnspringboot.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="slot_availibility")
public class SlotAvailibility {
@Id
@Column(name="id")
private long id;
@Column(name="date")
private LocalDate date;
@Column(name="time")
private LocalTime time;
@Column(name="app_status")
private boolean appStatus;
@Column(name="status")
private boolean status;
@Column(name="is_deleted")
private boolean isDeleted;
@Column(name="app_created_date")
private LocalDate appCreatedDate;
@Column(name="shop_id")
private int shopId;
@Column(name="consumer_id")
private int consumerId;
@Column(name="reason_for_calncel")
private String reasonForCancellation;
@Column(name="updated_date")
private LocalDate updateDate;
public SlotAvailibility(long id, LocalDate date, LocalTime time, boolean appStatus, boolean status, boolean isDeleted,
		LocalDate appCreatedDate, int shopId, int consumerId, String reasonForCancellation, LocalDate updateDate) {
	super();
	this.id = id;
	this.date = date;
	this.time = time;
	this.appStatus = appStatus;
	this.status = status;
	this.isDeleted = isDeleted;
	this.appCreatedDate = appCreatedDate;
	this.shopId = shopId;
	this.consumerId = consumerId;
	this.reasonForCancellation = reasonForCancellation;
	this.updateDate = updateDate;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public LocalTime getTime() {
	return time;
}
public void setTime(LocalTime time) {
	this.time = time;
}
public boolean isAppStatus() {
	return appStatus;
}
public void setAppStatus(boolean appStatus) {
	this.appStatus = appStatus;
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
public LocalDate getAppCreatedDate() {
	return appCreatedDate;
}
public void setAppCreatedDate(LocalDate appCreatedDate) {
	this.appCreatedDate = appCreatedDate;
}
public int getShopId() {
	return shopId;
}
public void setShopId(int shopId) {
	this.shopId = shopId;
}
public int getConsumerId() {
	return consumerId;
}
public void setConsumerId(int consumerId) {
	this.consumerId = consumerId;
}
public String getReasonForCancellation() {
	return reasonForCancellation;
}
public void setReasonForCancellation(String reasonForCancellation) {
	this.reasonForCancellation = reasonForCancellation;
}
public LocalDate getUpdateDate() {
	return updateDate;
}
public void setUpdateDate(LocalDate updateDate) {
	this.updateDate = updateDate;
}
@Override
public String toString() {
	return "SlotAvailibility [id=" + id + ", date=" + date + ", time=" + time + ", appStatus=" + appStatus + ", status="
			+ status + ", isDeleted=" + isDeleted + ", appCreatedDate=" + appCreatedDate + ", shopId=" + shopId
			+ ", consumerId=" + consumerId + ", reasonForCancellation=" + reasonForCancellation + ", updateDate="
			+ updateDate + "]";
}

}
