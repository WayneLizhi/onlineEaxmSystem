package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.PaperFillBean;
import com.online_examination_system.dao.PaperFillDAO;
import com.online_examination_system.service.PaperFillService;

public class PaperFillServiceImpl implements PaperFillService {
	private PaperFillDAO paperFillDAO;

	public PaperFillDAO getPaperFillDAO() {
		return paperFillDAO;
	}
	public void setPaperFillDAO(PaperFillDAO paperFillDAO) {
		this.paperFillDAO = paperFillDAO;
	}
	public void addPaperFill(PaperFillBean paperFillBean) {
		// TODO Auto-generated method stub
		this.paperFillDAO.addPaperFill(paperFillBean);
	}
	public List<PaperFillBean> searchPaperFill(int studentid, String papername) {
		// TODO Auto-generated method stub
		return this.paperFillDAO.searchPaperFill(studentid, papername);
	}
	public PaperFillBean findPaperFillById(int id) {
		// TODO Auto-generated method stub
		return this.paperFillDAO.findPaperFillById(id);
	}
	public void updatePaperFill(PaperFillBean paperFillBean) {
		// TODO Auto-generated method stub
		this.paperFillDAO.updatePaperFill(paperFillBean);
	}
	public List<PaperFillBean> searchPaperFill(int studentid, int courseid,
			String papername) {
		// TODO Auto-generated method stub
		return this.paperFillDAO.searchPaperFill(studentid, courseid, papername);
	}
	public List<PaperFillBean> searchPaperFill(String papername) {
		// TODO Auto-generated method stub
		return this.paperFillDAO.searchPaperFill(papername);
	}
	public List<PaperFillBean> searchPaperFill(int studentid, String papername,
			String studentanswer) {
		// TODO Auto-generated method stub
		return this.paperFillDAO.searchPaperFill(studentid, papername, studentanswer);
	}
}
