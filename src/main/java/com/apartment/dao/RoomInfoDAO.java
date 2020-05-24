package com.apartment.dao;

import java.util.List;
import java.util.Map;

import com.apartment.bean.RoomInfo;

public interface RoomInfoDAO {
	int deleteRoomInfoById(int roomId);
	int insertRoomInfo(RoomInfo roomInfo);
	RoomInfo selectRoomInfoById(int roomId);
	int updateRoomInfo(RoomInfo roomInfo);
	List<Map<String, Object>> getAllRooms();
}
