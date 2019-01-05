package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.PaperSelectBean;
import com.online_examination_system.dao.PaperSelectDAO;

public class PaperSelectDAOImpl extends HibernateDaoSupport implements
		PaperSelectDAO {
	public void addPaperSelect(PaperSelectBean paperSelectBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(paperSelectBean);
	}
	@SuppressWarnings("unchecked")
	public List<String> searchPaper() {
		// TODO Auto-generated method stub
		String hql = "select distinct paperSelectBean.papername from PaperSelectBean paperSelectBean";
		return this.getHibernateTemplate().find(hql);
	}
	@SuppressWarnings("unchecked")
	public List<PaperSelectBean> searchPaperSelect(int studentid,
			String papername) {
		// TODO Auto-generated method stub
		String hql = "from PaperSelectBean paperSelectBean where paperSelectBean.studentid=" + studentid + " and paperSelectBean.papername='" + papername + "'";
		return this.getHibernateTemplate().find(hql);
	}
	public PaperSelectBean findPaperSelectById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(PaperSelectBean.class, id);
	}
	public void updatePaperSelect(PaperSelectBean paperSelectBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(paperSelectBean);
	}
	@SuppressWarnings("unchecked")
	public List<Integer> searchCourseid(int studentid) {
		// TODO Auto-generated method stub
		String hql = "select distinct paperSelectBean.courseid from PaperSelectBean paperSelectBean where paperSelectBean.studentid=" + studentid;
		return this.getHibernateTemplate().find(hql);
	}
	@SuppressWarnings("unchecked")
	public List<PaperSelectBean> searchPaperSelect(int studentid, int courseid,
			String papername) {
		// TODO Auto-generated method stub
		String hql = "from PaperSelectBean paperSelectBean where paperSelectBean.studentid=" + studentid + " and paperSelectBean.courseid=" + courseid + " and paperSelectBean.papername='" + papername + "'";
		return this.getHibernateTemplate().find(hql);
	}
	@SuppressWarnings("unchecked")
	public List<PaperSelectBean> searchPaperSelect(int studentid,
			String papername, int studentanswer) {
		// TODO Auto-generated method stub
		String hql = "from PaperSelectBean paperSelectBean where paperSelectBean.studentid=" + studentid + " and paperSelectBean.studentanswer!=" + studentanswer + " and paperSelectBean.papername='" + papername + "'";
		return this.getHibernateTemplate().find(hql);
	}
}
