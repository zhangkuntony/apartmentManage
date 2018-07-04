package com.tim.dao;

import java.util.List;
import java.util.Map;

import com.tim.bean.ProjectInfoBean;

public interface ProjectInfoDAO {
	int deleteProjectInfoById(int id);
	int insertProjectInfo(ProjectInfoBean projectInfoBean);
	ProjectInfoBean selectProjectInfoById(int id);
	int updateProjectInfo(ProjectInfoBean projectInfoBean);
	List<Map<String, Object>> getAllProject();
}
