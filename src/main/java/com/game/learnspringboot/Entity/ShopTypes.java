package com.game.learnspringboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shop_types")
public class ShopTypes {
	@Id
	@Column(name="id")
	private long id;
	@Column(name="type")
	private String type;
	@Column(name="code")
	private String code;
	public ShopTypes(long id, String type, String code) {
		super();
		this.id = id;
		this.type = type;
		this.code = code;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "ShopTypes [id=" + id + ", type=" + type + ", code=" + code + "]";
	}

}
