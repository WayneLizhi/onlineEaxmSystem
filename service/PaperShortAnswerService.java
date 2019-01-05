package com.online_examination_system.service;

import java.util.List;

import com.online_examination_system.bean.PaperShortAnswerBean;

public interface PaperShortAnswerService {
	//添加试卷简答题
	public void addPaperShortAnswer(PaperShortAnswerBean paperShortAnswerBean);
	//papername查找试卷简答题
	public List<PaperShortAnswerBean> searchShortAnswer(String papername);
	//studentid、papername查找试卷简答题
	public List<PaperShortAnswerBean> searchShortAnswer(int studentid, String papername);
	//ID查询简答题
	public PaperShortAnswerBean findPaperShortAnswerById(int id);
	//更新简答题
	public void updatePaperShortAnswer(PaperShortAnswerBean paperShortAnswerBean);
	//studentid、papername、courseid查找试卷简答题
	public List<PaperShortAnswerBean> searchShortAnswer(int studentid, int courseid, String papername);
	//studentid、papername、studentanswer查找试卷简答题
	public List<PaperShortAnswerBean> searchShortAnswer(int studentid, String papername, String studentanswer);
}
