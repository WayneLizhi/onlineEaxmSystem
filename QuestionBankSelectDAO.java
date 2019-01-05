package com.online_examination_system.dao;

import java.util.List;

import com.online_examination_system.bean.QuestionBankSelectBean;

public interface QuestionBankSelectDAO {
	//添加选择题
	public void addQuestionBankSelect(QuestionBankSelectBean questionBankSelectBean);
	//条件查询选择题
	public List<QuestionBankSelectBean> searchQuestionBankSelect(QuestionBankSelectBean questionBankSelectBean);
	//ID查询选择题
	public QuestionBankSelectBean findQuestionBankSelectById(int id);
	//更新选择题
	public void updateQuestionBankSelect(QuestionBankSelectBean questionBankSelectBean);
	//删除选择题
	public void deleteQuestionBankSelect(QuestionBankSelectBean questionBankSelectBean);
}
