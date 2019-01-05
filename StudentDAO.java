package com.online_examination_system.dao;

import java.util.List;

import com.online_examination_system.bean.StudentBean;

public interface StudentDAO {
	//添加学生
	public void addStudentBean(StudentBean studentBean);
	//查找学生信息
	public List<StudentBean> searchStudentBean(StudentBean studentBean);
	//ID查找学生
	public StudentBean findStudentById(int id);
	//更新学生
	public void updateStudent(StudentBean studentBean);
	//删除学生
	public void deleteStudent(StudentBean studentBean);
	//hql查询学生
	public List<StudentBean> findStudentByHql(String hql);
}
