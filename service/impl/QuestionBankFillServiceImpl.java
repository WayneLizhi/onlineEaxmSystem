package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.QuestionBankFillBean;
import com.online_examination_system.dao.QuestionBankFillDAO;
import com.online_examination_system.service.QuestionBankFillService;

public class QuestionBankFillServiceImpl implements QuestionBankFillService {
	private QuestionBankFillDAO questionBankFillDAO;

	public QuestionBankFillDAO getQuestionBankFillDAO() {
		return questionBankFillDAO;
	}
	public void setQuestionBankFillDAO(QuestionBankFillDAO questionBankFillDAO) {
		this.questionBankFillDAO = questionBankFillDAO;
	}
	
	public void addQuestionBankFill(QuestionBankFillBean questionBankFillBean) {
		// TODO Auto-generated method stub
		this.questionBankFillDAO.addQuestionBankFill(questionBankFillBean);
	}
	public List<QuestionBankFillBean> searchQuestionBankFill(
			QuestionBankFillBean questionBankFillBean) {
		// TODO Auto-generated method stub
		return this.questionBankFillDAO.searchQuestionBankFill(questionBankFillBean);
	}
	public QuestionBankFillBean findQuestionBankFillById(int id) {
		// TODO Auto-generated method stub
		return this.questionBankFillDAO.findQuestionBankFillById(id);
	}
	public void updateQuestionBankFill(QuestionBankFillBean questionBankFillBean) {
		// TODO Auto-generated method stub
		this.questionBankFillDAO.updateQuestionBankFill(questionBankFillBean);
	}
	public void deleteQuestionBankFill(QuestionBankFillBean questionBankFillBean) {
		// TODO Auto-generated method stub
		this.questionBankFillDAO.deleteQuestionBankFill(questionBankFillBean);
	}
}
