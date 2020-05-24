package com.apartment.service;

import java.util.List;
import java.util.Map;

import com.apartment.bean.RoomInfo;

public interface IRoomInfoService {
	public RoomInfo getRoomInfoById(int roomId);
	public List<Map<String, Object>> getAllRooms();
}
