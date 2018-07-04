package com.tim.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tim.bean.ProjectInfoBean;
import com.tim.service.IProjectInfoService;

@Controller
@RequestMapping("/projectInfo")
public class ProjectInfoController {
	@Resource
	private IProjectInfoService projectInfoService;
	
	@RequestMapping("/showProjectById")
	public String toIndex(HttpServletRequest request, Model model) {
		int projectInfoId = Integer.parseInt(request.getParameter("projectInfoId"));
		ProjectInfoBean projectInfoBean = this.projectInfoService.getProjectInfoById(projectInfoId);
		model.addAttribute("projectInfoBean", projectInfoBean);
		return "projectInfo";
	}
	
	@RequestMapping(value = "/showProject", method = RequestMethod.GET)
	@ResponseBody
	public List<Map<String, Object>> getProject(HttpServletRequest request) {
		List<Map<String, Object>> list = this.projectInfoService.getAllProject();
		return list;
	}
}
