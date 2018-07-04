package com.tim.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tim.bean.ProjectInfoBean;
import com.tim.dao.ProjectInfoDAO;
import com.tim.service.IProjectInfoService;

@Service("projectInfoService")
public class ProjectInfoService implements IProjectInfoService {
	@Resource
	private ProjectInfoDAO ProjectInfoDAO;
	
	public ProjectInfoBean getProjectInfoById(int id) {
		return this.ProjectInfoDAO.selectProjectInfoById(id);
	}
	
	public List<Map<String, Object>> getAllProject() {
		return this.ProjectInfoDAO.getAllProject();
	}
}
