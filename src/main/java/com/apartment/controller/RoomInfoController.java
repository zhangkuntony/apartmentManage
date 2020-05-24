package com.apartment.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apartment.bean.RoomInfo;
import com.apartment.service.IRoomInfoService;

@Controller
@RequestMapping("/roomInfo")
public class RoomInfoController {
	@Resource
	private IRoomInfoService roomInfoService;
	
	@RequestMapping("/showRoomById")
	public String toIndex(HttpServletRequest request, Model model) {
		int roomId = Integer.parseInt(request.getParameter("roomId"));
		RoomInfo roomInfo = this.roomInfoService.getRoomInfoById(roomId);
		model.addAttribute("roomInfo", roomInfo);
		return "roomInfo";
	}
	
	@RequestMapping(value = "/showRoom", method = RequestMethod.GET)
	@ResponseBody
	public List<Map<String, Object>> getRooms(HttpServletRequest request) {
		List<Map<String, Object>> list = this.roomInfoService.getAllRooms();
		return list;
	}
}
