package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.QuestionBankFillBean;
import com.online_examination_system.dao.QuestionBankFillDAO;

public class QuestionBankFillDAOImpl extends HibernateDaoSupport implements
		QuestionBankFillDAO {
	public void addQuestionBankFill(QuestionBankFillBean questionBankFillBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(questionBankFillBean);
	}
	@SuppressWarnings("unchecked")
	public List<QuestionBankFillBean> searchQuestionBankFill(
			QuestionBankFillBean questionBankFillBean) {
		// TODO Auto-generated method stub
		String hql = "from QuestionBankFillBean questionBankFillBean where 1=1";
		if(!questionBankFillBean.getTeachername().equals("")){
			hql = hql + " and questionBankFillBean.teachername='" + questionBankFillBean.getTeachername() + "'";
		}
		if(questionBankFillBean.getCourseid() != 0){
			hql = hql + " and questionBankFillBean.courseid=" + questionBankFillBean.getCourseid();
		}
		if(!questionBankFillBean.getQuestion().equals("")){
			hql = hql + " and questionBankFillBean.question like '%" + questionBankFillBean.getQuestion() + "%'";
		}
		return this.getHibernateTemplate().find(hql);
	}
	public QuestionBankFillBean findQuestionBankFillById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(QuestionBankFillBean.class, id);
	}
	public void updateQuestionBankFill(QuestionBankFillBean questionBankFillBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(questionBankFillBean);
	}
	public void deleteQuestionBankFill(QuestionBankFillBean questionBankFillBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(questionBankFillBean);
	}
}
