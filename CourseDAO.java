package com.online_examination_system.dao;

import java.util.List;

import com.online_examination_system.bean.CourseBean;

public interface CourseDAO {
	//添加课程
	public void addCourse(CourseBean courseBean);
	//查找所有课程
	public List<CourseBean> findAllCourse();
	//ID查询课程
	public CourseBean findCourseById(int id);
	//更新课程
	public void updateCourse(CourseBean courseBean);
	//删除课程
	public void deleteCourse(CourseBean courseBean);
}
