package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.PaperShortAnswerBean;

public class PaperShortAnswerDAOImpl extends HibernateDaoSupport implements
		com.online_examination_system.dao.PaperShortAnswerDAO {
	public void addPaperShortAnswer(PaperShortAnswerBean paperShortAnswerBean) {
		// TODO Auto-generated method stub
		try{
			this.getHibernateTemplate().save(paperShortAnswerBean);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public List<PaperShortAnswerBean> searchShortAnswer(int studentid,
			String papername) {
		// TODO Auto-generated method stub
		String hql = "from PaperShortAnswerBean paperShortAnswerBean where paperShortAnswerBean.studentid=" + studentid + " and paperShortAnswerBean.papername='" + papername + "'";
		return this.getHibernateTemplate().find(hql);
	}
	public PaperShortAnswerBean findPaperShortAnswerById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(PaperShortAnswerBean.class, id);
	}
	public void updatePaperShortAnswer(PaperShortAnswerBean paperShortAnswerBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(paperShortAnswerBean);
	}
	@SuppressWarnings("unchecked")
	public List<PaperShortAnswerBean> searchShortAnswer(int studentid,
			int courseid, String papername) {
		// TODO Auto-generated method stub
		String hql = "from PaperShortAnswerBean paperShortAnswerBean where paperShortAnswerBean.studentid=" + studentid + " and paperShortAnswerBean.courseid=" + courseid + " and paperShortAnswerBean.papername='" + papername + "'";
		return this.getHibernateTemplate().find(hql);
	}
	@SuppressWarnings("unchecked")
	public List<PaperShortAnswerBean> searchShortAnswer(String papername) {
		// TODO Auto-generated method stub
		String hql = "from PaperShortAnswerBean paperShortAnswerBean where paperShortAnswerBean.papername='" + papername + "' and paperShortAnswerBean.teachername!='' and paperShortAnswerBean.studentid!=1";
		return this.getHibernateTemplate().find(hql);
	}
	@SuppressWarnings("unchecked")
	public List<PaperShortAnswerBean> searchShortAnswer(int studentid,
			String papername, String studentanswer) {
		// TODO Auto-generated method stub
		String hql = "from PaperShortAnswerBean paperShortAnswerBean where paperShortAnswerBean.studentid=" + studentid + " and paperShortAnswerBean.studentanswer!='" + studentanswer + "' and paperShortAnswerBean.papername='" + papername + "'";
		return this.getHibernateTemplate().find(hql);
	}
}
