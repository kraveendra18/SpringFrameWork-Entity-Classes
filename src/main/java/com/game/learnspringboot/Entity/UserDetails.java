package com.game.learnspringboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name=" user_details")
public class UserDetails {
	@Id
	private long id;
	
  @Column(name="first_name")
	private String firstName;
  
  @Column(name="last_name")
	private String lastName;
  
  @Column(name="username")
	private String userName;
  
  @Column(name="password")
    private String password;
  
  @Column(name="email")
    private String emailId;
  
  @Column(name="phone")
   private long phoneNumber;
  
  @Column(name="gender")
  	private char gender;
  
  @Column(name="role_id")
  	private int roleID;
  
  @Column(name="created_at")
    private boolean createdAt;
  
  @Column(name="status")
  	private boolean status;
  
  @Column(name="is_deleted")
  private boolean isDeleted;
  
  @Column(name="owner_id")
   private long ownerId;

public UserDetails(long id, String firstName, String lastName, String userName, String password, String emailId,
		long phoneNumber, char gender, int roleID, boolean createdAt, boolean status, boolean isDeleted, long ownerId) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.userName = userName;
	this.password = password;
	this.emailId = emailId;
	this.phoneNumber = phoneNumber;
	this.gender = gender;
	this.roleID = roleID;
	this.createdAt = createdAt;
	this.status = status;
	this.isDeleted = isDeleted;
	this.ownerId = ownerId;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
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

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public int getRoleID() {
	return roleID;
}

public void setRoleID(int roleID) {
	this.roleID = roleID;
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

public long getOwnerId() {
	return ownerId;
}

public void setOwnerId(long ownerId) {
	this.ownerId = ownerId;
}

@Override
public String toString() {
	return "UserDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
			+ ", password=" + password + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber + ", gender=" + gender
			+ ", roleID=" + roleID + ", createdAt=" + createdAt + ", status=" + status + ", isDeleted=" + isDeleted
			+ ", ownerId=" + ownerId + "]";
}
}
	