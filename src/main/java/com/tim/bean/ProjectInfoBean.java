package com.tim.bean;

public class ProjectInfoBean {
	int id;
	String projectName;
	String projectManager;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getProjectManager() {
		return projectManager;
	}
	
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
}
