package com.game.learnspringboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="serice_master")
public class SericeMaster {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="shop_type_id")
	private int shopTypeId;
	@Column(name="status")
	private boolean status;
	@Column(name="is_deleted")
	private boolean isDeleted;
	public SericeMaster(int id, String name, int shopTypeId, boolean status, boolean isDeleted) {
		super();
		this.id = id;
		this.name = name;
		this.shopTypeId = shopTypeId;
		this.status = status;
		this.isDeleted = isDeleted;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getShopTypeId() {
		return shopTypeId;
	}
	public void setShopTypeId(int shopTypeId) {
		this.shopTypeId = shopTypeId;
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
		return "SericeMaster [id=" + id + ", name=" + name + ", shopTypeId=" + shopTypeId + ", status=" + status
				+ ", isDeleted=" + isDeleted + "]";
	}
}