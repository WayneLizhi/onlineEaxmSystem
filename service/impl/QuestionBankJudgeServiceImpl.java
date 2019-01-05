package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.QuestionBankJudgeBean;
import com.online_examination_system.dao.QuestionBankJudgeDAO;
import com.online_examination_system.service.QuestionBankJudgeService;

public class QuestionBankJudgeServiceImpl implements QuestionBankJudgeService {
	private QuestionBankJudgeDAO questionBankJudgeDAO;

	public QuestionBankJudgeDAO getQuestionBankJudgeDAO() {
		return questionBankJudgeDAO;
	}
	public void setQuestionBankJudgeDAO(QuestionBankJudgeDAO questionBankJudgeDAO) {
		this.questionBankJudgeDAO = questionBankJudgeDAO;
	}
	
	public void addQuestionBankJudge(QuestionBankJudgeBean questionBankJudgeBean) {
		// TODO Auto-generated method stub
		this.questionBankJudgeDAO.addQuestionBankJudge(questionBankJudgeBean);
	}
	public List<QuestionBankJudgeBean> searchQuestionBankJudge(
			QuestionBankJudgeBean questionBankJudgeBean) {
		// TODO Auto-generated method stub
		return this.questionBankJudgeDAO.searchQuestionBankJudge(questionBankJudgeBean);
	}
	public QuestionBankJudgeBean findQuestionBankJudgeById(int id) {
		// TODO Auto-generated method stub
		return this.questionBankJudgeDAO.findQuestionBankJudgeById(id);
	}
	public void updateQuestionBankJudgeAction(
			QuestionBankJudgeBean questionBankJudgeBean) {
		// TODO Auto-generated method stub
		this.questionBankJudgeDAO.updateQuestionBankJudgeAction(questionBankJudgeBean);
	}
	public void deleteQuestionBankJudge(
			QuestionBankJudgeBean questionBankJudgeBean) {
		// TODO Auto-generated method stub
		this.questionBankJudgeDAO.deleteQuestionBankJudge(questionBankJudgeBean);
	}
	public List<QuestionBankJudgeBean> findAllQuestionBankJudge() {
		// TODO Auto-generated method stub
		return this.questionBankJudgeDAO.findAllQuestionBankJudge();
	}
}
