package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.PaperShortAnswerBean;
import com.online_examination_system.dao.PaperShortAnswerDAO;
import com.online_examination_system.service.PaperShortAnswerService;

public class PaperShortAnswerServiceImpl implements PaperShortAnswerService {
	private PaperShortAnswerDAO paperShortAnswerDAO;

	public PaperShortAnswerDAO getPaperShortAnswerDAO() {
		return paperShortAnswerDAO;
	}
	public void setPaperShortAnswerDAO(PaperShortAnswerDAO paperShortAnswerDAO) {
		this.paperShortAnswerDAO = paperShortAnswerDAO;
	}
	public void addPaperShortAnswer(PaperShortAnswerBean paperShortAnswerBean) {
		// TODO Auto-generated method stub
		this.paperShortAnswerDAO.addPaperShortAnswer(paperShortAnswerBean);
	}
	public List<PaperShortAnswerBean> searchShortAnswer(int studentid,
			String papername) {
		// TODO Auto-generated method stub
		return this.paperShortAnswerDAO.searchShortAnswer(studentid, papername);
	}
	public PaperShortAnswerBean findPaperShortAnswerById(int id) {
		// TODO Auto-generated method stub
		return this.paperShortAnswerDAO.findPaperShortAnswerById(id);
	}
	public void updatePaperShortAnswer(PaperShortAnswerBean paperShortAnswerBean) {
		// TODO Auto-generated method stub
		this.paperShortAnswerDAO.updatePaperShortAnswer(paperShortAnswerBean);
	}
	public List<PaperShortAnswerBean> searchShortAnswer(int studentid,
			int courseid, String papername) {
		// TODO Auto-generated method stub
		return this.paperShortAnswerDAO.searchShortAnswer(studentid, courseid, papername);
	}
	public List<PaperShortAnswerBean> searchShortAnswer(String papername) {
		// TODO Auto-generated method stub
		return this.paperShortAnswerDAO.searchShortAnswer(papername);
	}
	public List<PaperShortAnswerBean> searchShortAnswer(int studentid,
			String papername, String studentanswer) {
		// TODO Auto-generated method stub
		return this.paperShortAnswerDAO.searchShortAnswer(studentid, papername, studentanswer);
	}
}
