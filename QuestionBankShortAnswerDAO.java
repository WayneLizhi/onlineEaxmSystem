package com.online_examination_system.dao;

import java.util.List;

import com.online_examination_system.bean.QuestionBankShortAnswerBean;

public interface QuestionBankShortAnswerDAO {
	//添加简答题
	public void addQuestionBankShortAnswer(QuestionBankShortAnswerBean questionBankShortAnswerBean);
	//查询简答题
	public List<QuestionBankShortAnswerBean> searchQuestionBankShortAnswer(QuestionBankShortAnswerBean questionBankShortAnswerBean);
	//ID查询简答题
	public QuestionBankShortAnswerBean findQuestionBankShortAnswerById(int id);
	//更新简答题
	public void updateQuestionBankShortAnswer(QuestionBankShortAnswerBean questionBankShortAnswerBean);
	//删除简答题
	public void deleteQuestionBankShortAnswer(QuestionBankShortAnswerBean questionBankShortAnswerBean);
	//查询所有简答题
	public List<QuestionBankShortAnswerBean> findAllQuestionBankShortAnswer();
}
