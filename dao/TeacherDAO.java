package com.online_examination_system.dao;

import java.util.List;

import com.online_examination_system.bean.TeacherBean;

public interface TeacherDAO {
	//添加教师信息
	public void addTeacher(TeacherBean teacherBean);
	//查看所有教师
	public List<TeacherBean> findAllTeacher();
	//ID查询教师
	public TeacherBean findTeacherById(int teacherBeanId);
	//删除教师
	public void deleteTeacher(TeacherBean teacherBean);
	//更新教师信息
	public void updateTeacher(TeacherBean teacherBean);
	//hql查询老师
	public List<TeacherBean> findTeacherByHql(String hql);
}
