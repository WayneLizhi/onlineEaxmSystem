package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.StudentBean;
import com.online_examination_system.dao.StudentDAO;
import com.online_examination_system.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	private StudentDAO studentDAO;

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public void addStudentBean(StudentBean studentBean) {
		// TODO Auto-generated method stub
		this.studentDAO.addStudentBean(studentBean);
	}
	public List<StudentBean> searchStudentBean(StudentBean studentBean) {
		// TODO Auto-generated method stub
		return this.studentDAO.searchStudentBean(studentBean);
	}
	public StudentBean findStudentById(int id) {
		// TODO Auto-generated method stub
		return this.studentDAO.findStudentById(id);
	}
	public void updateStudent(StudentBean studentBean) {
		// TODO Auto-generated method stub
		this.studentDAO.updateStudent(studentBean);
	}
	public void deleteStudent(StudentBean studentBean) {
		// TODO Auto-generated method stub
		this.studentDAO.deleteStudent(studentBean);
	}
	public List<StudentBean> findStudentByHql(String hql) {
		// TODO Auto-generated method stub
		return this.studentDAO.findStudentByHql(hql);
	}
}
