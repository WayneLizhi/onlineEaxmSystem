package com.online_examination_system.service;

import java.util.List;

import com.online_examination_system.bean.PaperJudgeBean;

public interface PaperJudgeService {
	//添加试卷判断题
	public void addPaperJudge(PaperJudgeBean paperJudgeBean);
	//studentid、papername查找试卷判断题
	public List<PaperJudgeBean> searchPaperJudge(int studentid, String papername);
	//ID查询判断题
	public PaperJudgeBean findPaperJudgeById(int id);
	//更新试卷判断题
	public void updatePaperJudge(PaperJudgeBean paperJudgeBean);
	//studentid、papername、courseid查找试卷判断题
	public List<PaperJudgeBean> searchPaperJudge(int studentid, int courseid, String papername);
	//studentid、papername、studentanswer查找试卷判断题
	public List<PaperJudgeBean> searchPaperJudge(int studentid, String papername, int studentanswer);
}
