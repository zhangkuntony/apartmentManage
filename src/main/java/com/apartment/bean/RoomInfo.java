package com.apartment.bean;

import java.sql.Timestamp;
import java.util.Date;

public class RoomInfo {
	private int roomId;
	private int roomType;
	private boolean orientation;
	private int rentType;
	private double rent;
	private Date contractStartDate;
	private Date contractEndDate;
	private Date rentEndDate;
	private Timestamp createTime;
	private Timestamp updateTime;
	
	public int getRoomId() {
		return roomId;
	}
	
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	
	public int getRoomType() {
		return roomType;
	}
	
	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}
	
	public boolean isOrientation() {
		return orientation;
	}
	
	public void setOrientation(boolean orientation) {
		this.orientation = orientation;
	}
	
	public int getRentType() {
		return rentType;
	}
	
	public void setRentType(int rentType) {
		this.rentType = rentType;
	}
	
	public double getRent() {
		return rent;
	}
	
	public void setRent(double rent) {
		this.rent = rent;
	}
	
	public Date getContractStartDate() {
		return contractStartDate;
	}
	
	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}
	
	public Date getContractEndDate() {
		return contractEndDate;
	}
	
	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}
	
	public Date getRentEndDate() {
		return rentEndDate;
	}
	
	public void setRentEndDate(Date rentEndDate) {
		this.rentEndDate = rentEndDate;
	}
	
	public Timestamp getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}	
}
