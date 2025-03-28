package com.medifinder.registeration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Register {

	@Id
	private String id;
	private String pharmacyName;
	private String userName;
	private int liscenceNo;
	private String area;
	private String completeAddress;
	private long phoneNo;
	private String openingHour;
	private String closingHour;
	private String owner;
	private String password;
	private String email;
	private String  status="PENDING";
	
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String pharmacyName, String userName, int liscenceNo, String area, String completeAddress,
			long phoneNo, String openingHour, String closingHour, String owner, String password, String id, String email,
			String status) {
		super();
		this.pharmacyName = pharmacyName;
		this.userName = userName;
		this.liscenceNo = liscenceNo;
		this.area = area;
		this.completeAddress = completeAddress;
		this.phoneNo = phoneNo;
		this.openingHour = openingHour;
		this.closingHour = closingHour;
		this.owner = owner;
		this.password = password;
		this.id = id;
		this.email = email;
		this.status = status;
	}
	public String getPharmacyName() {
		return pharmacyName;
	}
	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getLiscenceNo() {
		return liscenceNo;
	}
	public void setLiscenceNo(int liscenceNo) {
		this.liscenceNo = liscenceNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCompleteAddress() {
		return completeAddress;
	}
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getOpeningHour() {
		return openingHour;
	}
	public void setOpeningHour(String openingHour) {
		this.openingHour = openingHour;
	}
	public String getClosingHour() {
		return closingHour;
	}
	public void setClosingHour(String closingHour) {
		this.closingHour = closingHour;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
