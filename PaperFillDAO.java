package com.online_examination_system.dao;

import java.util.List;

import com.online_examination_system.bean.PaperFillBean;

public interface PaperFillDAO {
	//添加试卷填空题
	public void addPaperFill(PaperFillBean paperFillBean);
	//studentid查找试卷填空题
	public List<PaperFillBean> searchPaperFill(String papername);
	//studentid、papername查找试卷填空题
	public List<PaperFillBean> searchPaperFill(int studentid, String papername);
	//ID查询填空题
	public PaperFillBean findPaperFillById(int id);
	//更新填空题
	public void updatePaperFill(PaperFillBean paperFillBean);
	//studentid、papername、courseid查找试卷填空题
	public List<PaperFillBean> searchPaperFill(int studentid, int courseid, String papername);
	//studentid、papername、studentanswer查找试卷填空题
	public List<PaperFillBean> searchPaperFill(int studentid, String papername, String studentanswer);
}
