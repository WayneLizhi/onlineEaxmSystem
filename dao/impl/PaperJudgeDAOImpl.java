package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.PaperJudgeBean;
import com.online_examination_system.dao.PaperJudgeDAO;

public class PaperJudgeDAOImpl extends HibernateDaoSupport implements
		PaperJudgeDAO {
	public void addPaperJudge(PaperJudgeBean paperJudgeBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(paperJudgeBean);
	}
	@SuppressWarnings("unchecked")
	public List<PaperJudgeBean> searchPaperJudge(int studentid, String papername) {
		// TODO Auto-generated method stub
		String hql = "from PaperJudgeBean paperJudgeBean where paperJudgeBean.studentid=" + studentid + " and paperJudgeBean.papername='" + papername + "'";
		return this.getHibernateTemplate().find(hql);
	}
	public PaperJudgeBean findPaperJudgeById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(PaperJudgeBean.class, id);
	}
	public void updatePaperJudge(PaperJudgeBean paperJudgeBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(paperJudgeBean);
	}
	@SuppressWarnings("unchecked")
	public List<PaperJudgeBean> searchPaperJudge(int studentid, int courseid,
			String papername) {
		// TODO Auto-generated method stub
		String hql = "from PaperJudgeBean paperJudgeBean where paperJudgeBean.studentid=" + studentid + " and paperJudgeBean.courseid=" + courseid + " and paperJudgeBean.papername='" + papername + "'";
		return this.getHibernateTemplate().find(hql);
	}
	@SuppressWarnings("unchecked")
	public List<PaperJudgeBean> searchPaperJudge(int studentid,
			String papername, int studentanswer) {
		// TODO Auto-generated method stub
		String hql = "from PaperJudgeBean paperJudgeBean where paperJudgeBean.studentid=" + studentid + " and paperJudgeBean.studentanswer!=" + studentanswer + " and paperJudgeBean.papername='" + papername + "'";
		return this.getHibernateTemplate().find(hql);
	}
}
