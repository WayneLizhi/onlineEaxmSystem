package com.online_examination_system.dao;

import java.util.List;

import com.online_examination_system.bean.QuestionBankFillBean;

public interface QuestionBankFillDAO {
	//添加填空题
	public void addQuestionBankFill(QuestionBankFillBean questionBankFillBean);
	//查询填空题
	public List<QuestionBankFillBean> searchQuestionBankFill(QuestionBankFillBean questionBankFillBean);
	//ID查询填空题
	public QuestionBankFillBean findQuestionBankFillById(int id);
	//更新填空题
	public void updateQuestionBankFill(QuestionBankFillBean questionBankFillBean);
	//删除填空题
	public void deleteQuestionBankFill(QuestionBankFillBean questionBankFillBean);
}
