package com.online_examination_system.service;

import java.util.List;

import com.online_examination_system.bean.PaperSelectBean;

public interface PaperSelectService {
	//添加试卷选择题
	public void addPaperSelect(PaperSelectBean paperSelectBean);
	//查看考试试卷
	public List<String> searchPaper();
	//studentid、papername查找试卷选择题
	public List<PaperSelectBean> searchPaperSelect(int studentid, String papername);
	//ID查找试卷选择题
	public PaperSelectBean findPaperSelectById(int id);
	//更新试卷选择题
	public void updatePaperSelect(PaperSelectBean paperSelectBean);
	//studentid查看试卷课程
	public List<Integer> searchCourseid(int studentid);
	//studentid、papername、couseid查找试卷选择题
	public List<PaperSelectBean> searchPaperSelect(int studentid, int courseid, String papername);
	//studentid、papername、studentanswer查找试卷选择题
	public List<PaperSelectBean> searchPaperSelect(int studentid, String papername, int studentanswer);
}
