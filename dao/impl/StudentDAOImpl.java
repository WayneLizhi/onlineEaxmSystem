package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.StudentBean;
import com.online_examination_system.dao.StudentDAO;
import com.online_examination_system.util.DateUtils;

public class StudentDAOImpl extends HibernateDaoSupport implements StudentDAO {
	public void addStudentBean(StudentBean studentBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(studentBean);
	}
	@SuppressWarnings("unchecked")
	public List<StudentBean> searchStudentBean(StudentBean studentBean) {
		// TODO Auto-generated method stub
		String hql = "from StudentBean studentBean where 1=1";
		if(!studentBean.getSno().equals("")){
			hql = hql + " and studentBean.sno='" + studentBean.getSno() + "'";
		}
		if(!studentBean.getName().equals("")){
			hql = hql + " and studentBean.name='" + studentBean.getName() + "'";
		}
		if(studentBean.getBirthday() != null) {
			
			hql = hql + " and studentBean.birthday='" + DateUtils.dateToStr(studentBean.getBirthday()) + "'";
		}
		if(!studentBean.getNation().equals("")){
			hql = hql + " and studentBean.nation='" + studentBean.getNation() + "'";
		}
		if(!studentBean.getTel().equals("")){
			hql = hql + " and studentBean.tel='" + studentBean.getTel() + "'";
		}
		if(!studentBean.getEmail().equals("")){
			hql = hql + " and studentBean.email='" + studentBean.getEmail() + "'";
		}
		if(!studentBean.getAddress().equals("")){
			hql = hql + " and studentBean.address='" + studentBean.getAddress() + "'";
		}
		if(studentBean.getClassid() != 0){
			hql = hql + " and studentBean.classid=" + studentBean.getClassid();
		}
		if(!studentBean.getDes().equals("")){
			hql = hql + " and studentBean.des='" + studentBean.getDes() + "'";
		}
		return this.getHibernateTemplate().find(hql);
	}
	public StudentBean findStudentById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(StudentBean.class, id);
	}
	public void updateStudent(StudentBean studentBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(studentBean);
	}
	public void deleteStudent(StudentBean studentBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(studentBean);
	}
	@SuppressWarnings("unchecked")
	public List<StudentBean> findStudentByHql(String hql) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find(hql);
	}
}
