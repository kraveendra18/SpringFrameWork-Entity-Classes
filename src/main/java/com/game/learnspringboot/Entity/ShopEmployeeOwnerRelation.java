package com.game.learnspringboot.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shop_employee_ower_relation")
public class ShopEmployeeOwnerRelation {
@Id
@Column(name="id")
private long id;
@Column(name="owner_id")
private int ownerId;
@Column(name="shop_id")
private int shopId;
@Column(name="employee_id")
private int employeeId;
@Column(name="join_date")
private LocalDate joinDate;
@Column(name="status")
private boolean status;
@Column(name="is_deleted")
private boolean isDeleted;
public ShopEmployeeOwnerRelation(long id, int ownerId, int shopId, int employeeId, LocalDate joinDate, boolean status,
		boolean isDeleted) {
	super();
	this.id = id;
	this.ownerId = ownerId;
	this.shopId = shopId;
	this.employeeId = employeeId;
	this.joinDate = joinDate;
	this.status = status;
	this.isDeleted = isDeleted;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getOwnerId() {
	return ownerId;
}
public void setOwnerId(int ownerId) {
	this.ownerId = ownerId;
}
public int getShopId() {
	return shopId;
}
public void setShopId(int shopId) {
	this.shopId = shopId;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public LocalDate getJoinDate() {
	return joinDate;
}
public void setJoinDate(LocalDate joinDate) {
	this.joinDate = joinDate;
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
	return "ShopEmployeeOwnerRelation [id=" + id + ", ownerId=" + ownerId + ", shopId=" + shopId + ", employeeId="
			+ employeeId + ", joinDate=" + joinDate + ", status=" + status + ", isDeleted=" + isDeleted + "]";
}
}