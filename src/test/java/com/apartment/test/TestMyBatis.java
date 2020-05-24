package com.apartment.test;

import org.apache.log4j.Logger;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.apartment.bean.RoomInfo;
import com.apartment.service.IRoomInfoService;

@RunWith(SpringJUnit4ClassRunner.class)			//	表示继承了这个类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml"	})
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	
	@Resource
	private IRoomInfoService roomInfoService = null;
	
	@Test
	public void test() {
		RoomInfo roomInfo = roomInfoService.getRoomInfoById(101);
		logger.info(roomInfo);
		logger.info("roomInfo 转化为 json");
		logger.info(JSON.toJSONString(roomInfo));
	}
}
