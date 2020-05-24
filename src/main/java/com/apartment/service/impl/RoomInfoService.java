package com.apartment.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apartment.bean.RoomInfo;
import com.apartment.dao.RoomInfoDAO;
import com.apartment.service.IRoomInfoService;

@Service("roomInfoService")
public class RoomInfoService implements IRoomInfoService{
	@Resource
	private RoomInfoDAO RoomInfoDAO;
	
	public RoomInfo getRoomInfoById(int roomId) {
		return this.RoomInfoDAO.selectRoomInfoById(roomId);
	}
	
	public List<Map<String, Object>> getAllRooms() {
		return this.RoomInfoDAO.getAllRooms();
	}
}
