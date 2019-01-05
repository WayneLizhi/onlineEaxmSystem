package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.PaperFillBean;
import com.online_examination_system.dao.PaperFillDAO;

public class PaperFillDAOImpl extends HibernateDaoSupport implements PaperFillDAO {
	public void addPaperFill(PaperFillBean paperFillBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(paperFillBean);
	}
	@SuppressWarnings("unchecked")
	public List<PaperFillBean> searchPaperFill(int studentid, String papername) {
		// TODO Auto-generated method stub
		String hql = "from PaperFillBean paperFillBean where paperFillBean.studentid=" + studentid + " and paperFillBean.papername='" + papername + "'";
		return this.getHibernateTemplate().find(hql);
	}
	public PaperFillBean findPaperFillById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(PaperFillBean.class, id);
	}
	public void updatePaperFill(PaperFillBean paperFillBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(paperFillBean);
	}
	@SuppressWarnings("unchecked")
	public List<PaperFillBean> searchPaperFill(int studentid, int courseid,
			String papername) {
		// TODO Auto-generated method stub
		String hql = "from PaperFillBean paperFillBean where paperFillBean.studentid=" + studentid + " and paperFillBean.courseid=" + courseid + " and paperFillBean.papername='" + papername + "'";
		return this.getHibernateTemplate().find(hql);
	}
	@SuppressWarnings("unchecked")
	public List<PaperFillBean> searchPaperFill(String papername) {
		// TODO Auto-generated method stub
		String hql = "from PaperFillBean paperFillBean where paperFillBean.papername='" + papername + "' and paperFillBean.teachername!=''" + " and paperFillBean.studentid!=1";
		return this.getHibernateTemplate().find(hql);
	}
	@SuppressWarnings("unchecked")
	public List<PaperFillBean> searchPaperFill(int studentid, String papername,
			String studentanswer) {
		// TODO Auto-generated method stub
		String hql = "from PaperFillBean paperFillBean where paperFillBean.studentid=" + studentid + " and paperFillBean.studentanswer!='" + studentanswer + "' and paperFillBean.papername='" + papername + "'";
		return this.getHibernateTemplate().find(hql);
	}
}
