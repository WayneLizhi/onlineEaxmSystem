package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.TeacherBean;
import com.online_examination_system.dao.TeacherDAO;
import com.online_examination_system.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	private TeacherDAO teacherDAO;

	public TeacherDAO getTeacherDAO() {
		return teacherDAO;
	}
	public void setTeacherDAO(TeacherDAO teacherDAO) {
		this.teacherDAO = teacherDAO;
	}
	
	public void addTeacher(TeacherBean teacherBean) {
		// TODO Auto-generated method stub
		this.teacherDAO.addTeacher(teacherBean);
	}
	public List<TeacherBean> findAllTeacher() {
		// TODO Auto-generated method stub
		return this.teacherDAO.findAllTeacher();
	}
	public TeacherBean findTeacherById(int teacherBeanId) {
		// TODO Auto-generated method stub
		return this.teacherDAO.findTeacherById(teacherBeanId);
	}
	public void deleteTeacher(TeacherBean teacherBean) {
		// TODO Auto-generated method stub
		this.teacherDAO.deleteTeacher(teacherBean);
	}
	public void updateTeacher(TeacherBean teacherBean) {
		// TODO Auto-generated method stub
		this.teacherDAO.updateTeacher(teacherBean);
	}
	public List<TeacherBean> findTeacherByHql(String hql) {
		// TODO Auto-generated method stub
		return this.teacherDAO.findTeacherByHql(hql);
	}
}
