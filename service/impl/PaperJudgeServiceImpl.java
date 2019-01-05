package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.PaperJudgeBean;
import com.online_examination_system.dao.PaperJudgeDAO;
import com.online_examination_system.service.PaperJudgeService;

public class PaperJudgeServiceImpl implements PaperJudgeService {
	private PaperJudgeDAO paperJudgeDAO;

	public PaperJudgeDAO getPaperJudgeDAO() {
		return paperJudgeDAO;
	}
	public void setPaperJudgeDAO(PaperJudgeDAO paperJudgeDAO) {
		this.paperJudgeDAO = paperJudgeDAO;
	}
	public void addPaperJudge(PaperJudgeBean paperJudgeBean) {
		// TODO Auto-generated method stub
		this.paperJudgeDAO.addPaperJudge(paperJudgeBean);
	}
	public List<PaperJudgeBean> searchPaperJudge(int studentid, String papername) {
		// TODO Auto-generated method stub
		return this.paperJudgeDAO.searchPaperJudge(studentid, papername);
	}
	public PaperJudgeBean findPaperJudgeById(int id) {
		// TODO Auto-generated method stub
		return this.paperJudgeDAO.findPaperJudgeById(id);
	}
	public void updatePaperJudge(PaperJudgeBean paperJudgeBean) {
		// TODO Auto-generated method stub
		this.paperJudgeDAO.updatePaperJudge(paperJudgeBean);
	}
	public List<PaperJudgeBean> searchPaperJudge(int studentid, int courseid,
			String papername) {
		// TODO Auto-generated method stub
		return this.paperJudgeDAO.searchPaperJudge(studentid, courseid, papername);
	}
	public List<PaperJudgeBean> searchPaperJudge(int studentid,
			String papername, int studentanswer) {
		// TODO Auto-generated method stub
		return this.paperJudgeDAO.searchPaperJudge(studentid, papername, studentanswer);
	}
}
