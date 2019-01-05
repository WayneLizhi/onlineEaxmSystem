package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.MajorBean;
import com.online_examination_system.dao.MajorDAO;

public class MajorDAOImpl extends HibernateDaoSupport implements MajorDAO {

	public void addMajor(MajorBean majorBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(majorBean);
	}
	
	@SuppressWarnings("unchecked")
	public List<MajorBean> findAllMajor() {
		// TODO Auto-generated method stub
		String hql = "from MajorBean majorBean order by majorBean.id asc";
		List<MajorBean> list = this.getHibernateTemplate().find(hql);
		return list;
	}
	@SuppressWarnings("unchecked")
	public List<MajorBean> findConditionMajor(int deptId) {
		// TODO Auto-generated method stub
		String hql = "from MajorBean majorBean where majorBean.deptId=" + deptId + " order by majorBean.id asc";
		List<MajorBean> list = this.getHibernateTemplate().find(hql);
		return list;
	}
	public void updateMajor(MajorBean majorBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(majorBean);
	}
	//ID查询专业
	public MajorBean findMajorById(int majorId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(MajorBean.class, majorId);
	}
	//删除专业
	public void deleteMajor(MajorBean majorBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(majorBean);
	}

}
