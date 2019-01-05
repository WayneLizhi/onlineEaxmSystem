package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.QuestionBankJudgeBean;
import com.online_examination_system.dao.QuestionBankJudgeDAO;

public class QuestionBankJudgeDAOImpl extends HibernateDaoSupport implements
		QuestionBankJudgeDAO {
	public void addQuestionBankJudge(QuestionBankJudgeBean questionBankJudgeBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(questionBankJudgeBean);
	}
	@SuppressWarnings("unchecked")
	public List<QuestionBankJudgeBean> searchQuestionBankJudge(
			QuestionBankJudgeBean questionBankJudgeBean) {
		// TODO Auto-generated method stub
		String hql = "from QuestionBankJudgeBean questionBankJudgeBean where 1=1";
		if(!questionBankJudgeBean.getTeachername().equals("")){
			hql = hql + " and questionBankJudgeBean.teachername='" + questionBankJudgeBean.getTeachername() + "'";
		}
		if(questionBankJudgeBean.getCourseid() != 0){
			hql = hql + " and questionBankJudgeBean.courseid=" + questionBankJudgeBean.getCourseid();
		}
		if(!questionBankJudgeBean.getQuestion().equals("")){
			hql = hql + " and questionBankJudgeBean.question like '%" + questionBankJudgeBean.getQuestion() + "%'";
		}
		return this.getHibernateTemplate().find(hql);
	}
	public QuestionBankJudgeBean findQuestionBankJudgeById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(QuestionBankJudgeBean.class, id);
	}
	public void updateQuestionBankJudgeAction(
			QuestionBankJudgeBean questionBankJudgeBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(questionBankJudgeBean);
	}
	public void deleteQuestionBankJudge(
			QuestionBankJudgeBean questionBankJudgeBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(questionBankJudgeBean);
	}
	@SuppressWarnings("unchecked")
	public List<QuestionBankJudgeBean> findAllQuestionBankJudge() {
		// TODO Auto-generated method stub
		String hql = "from QuestionBankJudgeBean questionBankJudgeBean order by questionBankJudgeBean.id asc";
		return this.getHibernateTemplate().find(hql);
	}
}
