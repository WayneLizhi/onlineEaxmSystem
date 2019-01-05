package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.QuestionBankSelectBean;
import com.online_examination_system.dao.QuestionBankSelectDAO;

public class QuestionBankSelectDAOImpl extends HibernateDaoSupport implements
		QuestionBankSelectDAO {
	public void addQuestionBankSelect(
			QuestionBankSelectBean questionBankSelectBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(questionBankSelectBean);
	}
	@SuppressWarnings("unchecked")
	public List<QuestionBankSelectBean> searchQuestionBankSelect(
			QuestionBankSelectBean questionBankSelectBean) {
		// TODO Auto-generated method stub
		String hql = "from QuestionBankSelectBean questionBankSelectBean where 1=1";
		if (!questionBankSelectBean.getTeachername().equals("")){
			hql = hql + " and questionBankSelectBean.teachername='" + questionBankSelectBean.getTeachername() + "'";
		}
		if (questionBankSelectBean.getCourseid() != 0) {
			hql = hql + " and questionBankSelectBean.courseid=" + questionBankSelectBean.getCourseid();
		}
		if (!questionBankSelectBean.getQuestion().equals("")){
			hql = hql + " and questionBankSelectBean.question like '%" + questionBankSelectBean.getQuestion() + "%'";
		}
		return this.getHibernateTemplate().find(hql);
	}
	public QuestionBankSelectBean findQuestionBankSelectById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(QuestionBankSelectBean.class, id);
	}
	public void updateQuestionBankSelect(
			QuestionBankSelectBean questionBankSelectBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(questionBankSelectBean);
	}
	public void deleteQuestionBankSelect(
			QuestionBankSelectBean questionBankSelectBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(questionBankSelectBean);
	}
}
