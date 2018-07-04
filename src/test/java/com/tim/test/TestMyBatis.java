package com.tim.test;

import org.apache.log4j.Logger;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.tim.bean.ProjectInfoBean;
import com.tim.service.IProjectInfoService;

@RunWith(SpringJUnit4ClassRunner.class)			//	表示继承了这个类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml"	})
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	
	@Resource
	private IProjectInfoService projectInfoService = null;
	
	@Test
	public void test() {
		ProjectInfoBean projectInfoBean = projectInfoService.getProjectInfoById(1);
		logger.info(projectInfoBean);
		logger.info("projectInfo 转化为 json");
		logger.info(JSON.toJSONString(projectInfoBean));
	}
}
