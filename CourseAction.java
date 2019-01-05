package com.online_examination_system.action;

import java.util.ArrayList;
import java.util.List;

import com.online_examination_system.bean.CourseBean;
import com.online_examination_system.service.CourseService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class CourseAction extends ActionSupport {
	
	private CourseService courseService;
	private CourseBean courseBean;
	
	List<CourseBean> listCourseBean = new ArrayList<CourseBean>();

	public CourseService getCourseService() {
		return courseService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	public CourseBean getCourseBean() {
		return courseBean;
	}
	public void setCourseBean(CourseBean courseBean) {
		this.courseBean = courseBean;
	}
	public List<CourseBean> getListCourseBean() {
		return listCourseBean;
	}
	public void setListCourseBean(List<CourseBean> listCourseBean) {
		this.listCourseBean = listCourseBean;
	}
	
	//添加课程
	public String addCourse(){
		try {
			this.courseService.addCourse(this.courseBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//列出所有课程
	public String listCourse(){
		try {
			this.listCourseBean = this.courseService.findAllCourse();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//ID查询课程
	public String findCourseById(){
		this.courseBean = this.courseService.findCourseById(this.courseBean.getId());
		return SUCCESS;
	}
	//更新课程
	public String updateCourse(){
		try{
			this.courseService.updateCourse(this.courseBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//删除课程
	public String deleteCourse(){
		try {
			this.courseBean = this.courseService.findCourseById(this.courseBean
					.getId());
			this.courseService.deleteCourse(this.courseBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
