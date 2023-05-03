package com.game.learnspringboot.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shop_availibility")
public class ShopAvailibility {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="from_date")
	private LocalDate fromDate;
	@Column(name="to_date")
	private LocalDate toDate;
	@Column(name="from_time")
	private LocalTime fromTime;
	@Column(name="to_time")
	private LocalTime toTime;
	@Column(name="intervals")
	private LocalTime intervals;
	@Column(name="shop_id")
	private long shopId;
	@Column(name="status")
	private boolean status;
	@Column(name="is_deleted")
	private boolean isDeleted;
	public ShopAvailibility(int id, LocalDate fromDate, LocalDate toDate, LocalTime fromTime, LocalTime toTime,
			LocalTime intervals, long shopId, boolean status, boolean isDeleted) {
		super();
		this.id = id;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.fromTime = fromTime;
		this.toTime = toTime;
		this.intervals = intervals;
		this.shopId = shopId;
		this.status = status;
		this.isDeleted = isDeleted;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	public LocalTime getFromTime() {
		return fromTime;
	}
	public void setFromTime(LocalTime fromTime) {
		this.fromTime = fromTime;
	}
	public LocalTime getToTime() {
		return toTime;
	}
	public void setToTime(LocalTime toTime) {
		this.toTime = toTime;
	}
	public LocalTime getIntervals() {
		return intervals;
	}
	public void setIntervals(LocalTime intervals) {
		this.intervals = intervals;
	}
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
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
	@Override
	public String toString() {
		return "ShopAvailibility [id=" + id + ", fromDate=" + fromDate + ", toDate=" + toDate + ", fromTime=" + fromTime
				+ ", toTime=" + toTime + ", intervals=" + intervals + ", shopId=" + shopId + ", status=" + status
				+ ", isDeleted=" + isDeleted + "]";
	}
}