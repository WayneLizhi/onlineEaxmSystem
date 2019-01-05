package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.QuestionBankShortAnswerBean;
import com.online_examination_system.dao.QuestionBankShortAnswerDAO;
import com.online_examination_system.service.QuestionBankShortAnswerService;

public class QuestionBankShortAnswerServiceImpl implements
		QuestionBankShortAnswerService {
	private QuestionBankShortAnswerDAO questionBankShortAnswerDAO;

	public QuestionBankShortAnswerDAO getQuestionBankShortAnswerDAO() {
		return questionBankShortAnswerDAO;
	}
	public void setQuestionBankShortAnswerDAO(
			QuestionBankShortAnswerDAO questionBankShortAnswerDAO) {
		this.questionBankShortAnswerDAO = questionBankShortAnswerDAO;
	}
	
	public void addQuestionBankShortAnswer(
			QuestionBankShortAnswerBean questionBankShortAnswerBean) {
		// TODO Auto-generated method stub
		this.questionBankShortAnswerDAO.addQuestionBankShortAnswer(questionBankShortAnswerBean);
	}
	public List<QuestionBankShortAnswerBean> searchQuestionBankShortAnswer(
			QuestionBankShortAnswerBean questionBankShortAnswerBean) {
		// TODO Auto-generated method stub
		return this.questionBankShortAnswerDAO.searchQuestionBankShortAnswer(questionBankShortAnswerBean);
	}
	public QuestionBankShortAnswerBean findQuestionBankShortAnswerById(int id) {
		// TODO Auto-generated method stub
		return this.questionBankShortAnswerDAO.findQuestionBankShortAnswerById(id);
	}
	public void updateQuestionBankShortAnswer(
			QuestionBankShortAnswerBean questionBankShortAnswerBean) {
		// TODO Auto-generated method stub
		this.questionBankShortAnswerDAO.updateQuestionBankShortAnswer(questionBankShortAnswerBean);
	}
	public void deleteQuestionBankShortAnswer(
			QuestionBankShortAnswerBean questionBankShortAnswerBean) {
		// TODO Auto-generated method stub
		this.questionBankShortAnswerDAO.deleteQuestionBankShortAnswer(questionBankShortAnswerBean);
	}
	public List<QuestionBankShortAnswerBean> findAllQuestionBankShortAnswer() {
		// TODO Auto-generated method stub
		return this.questionBankShortAnswerDAO.findAllQuestionBankShortAnswer();
	}
}
