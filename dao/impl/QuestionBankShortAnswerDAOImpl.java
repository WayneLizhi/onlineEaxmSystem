package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.QuestionBankShortAnswerBean;
import com.online_examination_system.dao.QuestionBankShortAnswerDAO;

public class QuestionBankShortAnswerDAOImpl extends HibernateDaoSupport
		implements QuestionBankShortAnswerDAO {
	public void addQuestionBankShortAnswer(
			QuestionBankShortAnswerBean questionBankShortAnswerBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(questionBankShortAnswerBean);
	}
	@SuppressWarnings("unchecked")
	public List<QuestionBankShortAnswerBean> searchQuestionBankShortAnswer(
			QuestionBankShortAnswerBean questionBankShortAnswerBean) {
		// TODO Auto-generated method stub
		String hql = "from QuestionBankShortAnswerBean questionBankShortAnswerBean where 1=1";
		if(!questionBankShortAnswerBean.getTearchername().equals("")){
			hql = hql + " and questionBankShortAnswerBean.tearchername='" + questionBankShortAnswerBean.getTearchername() + "'";
		}
		if(questionBankShortAnswerBean.getCourseid() != 0){
			hql = hql + " and questionBankShortAnswerBean.courseid=" + questionBankShortAnswerBean.getCourseid();
		}
		if(!questionBankShortAnswerBean.getQuestion().equals("")){
			hql = hql + " and questionBankShortAnswerBean.question like '%" + questionBankShortAnswerBean.getQuestion() + "'";
		}
		return this.getHibernateTemplate().find(hql);
	}
	public QuestionBankShortAnswerBean findQuestionBankShortAnswerById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(QuestionBankShortAnswerBean.class, id);
	}
	public void updateQuestionBankShortAnswer(
			QuestionBankShortAnswerBean questionBankShortAnswerBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(questionBankShortAnswerBean);
	}
	public void deleteQuestionBankShortAnswer(
			QuestionBankShortAnswerBean questionBankShortAnswerBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(questionBankShortAnswerBean);
	}
	@SuppressWarnings("unchecked")
	public List<QuestionBankShortAnswerBean> findAllQuestionBankShortAnswer() {
		// TODO Auto-generated method stub
		String hql = "from QuestionBankShortAnswerBean questionBankShortAnswerBean order by questionBankShortAnswerBean.id asc";
		return this.getHibernateTemplate().find(hql);
	}
}
