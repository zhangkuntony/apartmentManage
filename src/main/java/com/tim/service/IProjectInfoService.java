package com.tim.service;

import java.util.List;
import java.util.Map;

import com.tim.bean.ProjectInfoBean;

public interface IProjectInfoService {
	public ProjectInfoBean getProjectInfoById(int id);
	public List<Map<String, Object>> getAllProject();
}
