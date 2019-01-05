package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.CourseBean;
import com.online_examination_system.dao.CourseDAO;
import com.online_examination_system.service.CourseService;

public class CourseServiceImpl implements CourseService {
	
	private CourseDAO courseDAO;

	public CourseDAO getCourseDAO() {
		return courseDAO;
	}
	public void setCourseDAO(CourseDAO courseDAO) {
		this.courseDAO = courseDAO;
	}
	
	public void addCourse(CourseBean courseBean) {
		// TODO Auto-generated method stub
		this.courseDAO.addCourse(courseBean);
	}
	public List<CourseBean> findAllCourse() {
		// TODO Auto-generated method stub
		return this.courseDAO.findAllCourse();
	}
	public CourseBean findCourseById(int id) {
		// TODO Auto-generated method stub
		return this.courseDAO.findCourseById(id);
	}
	public void updateCourse(CourseBean courseBean) {
		// TODO Auto-generated method stub
		this.courseDAO.updateCourse(courseBean);
	}
	public void deleteCourse(CourseBean courseBean) {
		// TODO Auto-generated method stub
		this.courseDAO.deleteCourse(courseBean);
	}
}
