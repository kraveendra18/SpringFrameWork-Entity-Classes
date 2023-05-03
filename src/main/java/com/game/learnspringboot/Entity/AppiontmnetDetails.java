package com.game.learnspringboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="appiontment_details")
public class AppiontmnetDetails {
	@Id
	@Column(name="id")
	private long Id;
	@Column(name="Consumer_id")
	private String ConsumerId;
	@Column(name="shop_id")
	private String shopId;
	@Column(name="slot_id")
	private long slotId;
	@Column(name="Status")
	private boolean Status;
	@Column(name="is_deleted")
	private boolean isDeleted;
	@Column(name="is_created")
	private boolean isCreated;
	@Column(name="deleted_at")
	private boolean deletedAt;
	public AppiontmnetDetails(long id, String consumerId, String shopId, long slotId, boolean status, boolean isDeleted,
			boolean isCreated, boolean deletedAt) {
		super();
		Id = id;
		ConsumerId = consumerId;
		this.shopId = shopId;
		this.slotId = slotId;
		Status = status;
		this.isDeleted = isDeleted;
		this.isCreated = isCreated;
		this.deletedAt = deletedAt;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getConsumerId() {
		return ConsumerId;
	}
	public void setConsumerId(String consumerId) {
		ConsumerId = consumerId;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public long getSlotId() {
		return slotId;
	}
	public void setSlotId(long slotId) {
		this.slotId = slotId;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public boolean isCreated() {
		return isCreated;
	}
	public void setCreated(boolean isCreated) {
		this.isCreated = isCreated;
	}
	public boolean isDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(boolean deletedAt) {
		this.deletedAt = deletedAt;
	}
	@Override
	public String toString() {
		return "AppiontmnetDetails [Id=" + Id + ", ConsumerId=" + ConsumerId + ", shopId=" + shopId + ", slotId="
				+ slotId + ", Status=" + Status + ", isDeleted=" + isDeleted + ", isCreated=" + isCreated
				+ ", deletedAt=" + deletedAt + "]";
	}
	
	
}
