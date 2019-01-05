package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.PaperSelectBean;
import com.online_examination_system.bean.QuestionBankSelectBean;
import com.online_examination_system.dao.QuestionBankSelectDAO;
import com.online_examination_system.service.QuestionBankSelectService;

public class QuestionBankSelectServiceImpl implements QuestionBankSelectService {
	private QuestionBankSelectDAO questionBankSelectDAO;

	public QuestionBankSelectDAO getQuestionBankSelectDAO() {
		return questionBankSelectDAO;
	}
	public void setQuestionBankSelectDAO(QuestionBankSelectDAO questionBankSelectDAO) {
		this.questionBankSelectDAO = questionBankSelectDAO;
	}
	
	public void addQuestionBankSelect(
			QuestionBankSelectBean questionBankSelectBean) {
		// TODO Auto-generated method stub
		this.questionBankSelectDAO.addQuestionBankSelect(questionBankSelectBean);
	}
	public List<QuestionBankSelectBean> searchQuestionBankSelect(
			QuestionBankSelectBean questionBankSelectBean) {
		// TODO Auto-generated method stub
		return this.questionBankSelectDAO.searchQuestionBankSelect(questionBankSelectBean);
	}
	public QuestionBankSelectBean findQuestionBankSelectById(int id) {
		// TODO Auto-generated method stub
		return this.questionBankSelectDAO.findQuestionBankSelectById(id);
	}
	public void updateQuestionBankSelect(
			QuestionBankSelectBean questionBankSelectBean) {
		// TODO Auto-generated method stub
		this.questionBankSelectDAO.updateQuestionBankSelect(questionBankSelectBean);
	}
	public void deleteQuestionBankSelect(
			QuestionBankSelectBean questionBankSelectBean) {
		// TODO Auto-generated method stub
		this.questionBankSelectDAO.deleteQuestionBankSelect(questionBankSelectBean);
	}
}
