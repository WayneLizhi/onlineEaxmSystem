package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.TeacherBean;
import com.online_examination_system.dao.TeacherDAO;

public class TeacherDAOImpl extends HibernateDaoSupport implements TeacherDAO {
	public void addTeacher(TeacherBean teacherBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(teacherBean);
	}
	@SuppressWarnings("unchecked")
	public List<TeacherBean> findAllTeacher() {
		// TODO Auto-generated method stub
		String hql = "from TeacherBean teacherBean  order by teacherBean.id asc";
		List<TeacherBean> list = this.getHibernateTemplate().find(hql);
		return list;
	}
	public TeacherBean findTeacherById(int teacherBeanId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(TeacherBean.class, teacherBeanId);
	}
	public void deleteTeacher(TeacherBean teacherBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(teacherBean);
	}
	public void updateTeacher(TeacherBean teacherBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(teacherBean);
	}
	@SuppressWarnings("unchecked")
	public List<TeacherBean> findTeacherByHql(String hql) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find(hql);
	}
}
