package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.CourseBean;
import com.online_examination_system.dao.CourseDAO;

public class CourseDAOImpl extends HibernateDaoSupport implements CourseDAO {
	public void addCourse(CourseBean courseBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(courseBean);
	}
	@SuppressWarnings("unchecked")
	public List<CourseBean> findAllCourse() {
		// TODO Auto-generated method stub
		String hql = "from CourseBean courseBean order by courseBean.id asc";
		return this.getHibernateTemplate().find(hql);
	}
	public CourseBean findCourseById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(CourseBean.class, id);
	}
	public void updateCourse(CourseBean courseBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(courseBean);
	}
	public void deleteCourse(CourseBean courseBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(courseBean);
	}
}
