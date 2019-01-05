package com.online_examination_system.dao;

import java.util.List;

import com.online_examination_system.bean.QuestionBankJudgeBean;

public interface QuestionBankJudgeDAO {
	//添加判断题
	public void addQuestionBankJudge(QuestionBankJudgeBean questionBankJudgeBean);
	//查询判断题
	public List<QuestionBankJudgeBean> searchQuestionBankJudge(QuestionBankJudgeBean questionBankJudgeBean);
	//ID查询判断题
	public QuestionBankJudgeBean findQuestionBankJudgeById(int id);
	//更新判断题
	public void updateQuestionBankJudgeAction(QuestionBankJudgeBean questionBankJudgeBean);
	//删除判断题
	public void deleteQuestionBankJudge(QuestionBankJudgeBean questionBankJudgeBean);
	//查询所有判断题
	public List<QuestionBankJudgeBean> findAllQuestionBankJudge();
}
