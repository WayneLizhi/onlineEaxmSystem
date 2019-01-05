package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.PaperSelectBean;
import com.online_examination_system.dao.PaperSelectDAO;
import com.online_examination_system.service.PaperSelectService;

public class PaperSelectServiceImpl implements PaperSelectService {
	private PaperSelectDAO paperSelectDAO;

	public PaperSelectDAO getPaperSelectDAO() {
		return paperSelectDAO;
	}
	public void setPaperSelectDAO(PaperSelectDAO paperSelectDAO) {
		this.paperSelectDAO = paperSelectDAO;
	}
	
	public void addPaperSelect(PaperSelectBean paperSelectBean) {
		// TODO Auto-generated method stub
		this.paperSelectDAO.addPaperSelect(paperSelectBean);
	}
	public List<String> searchPaper() {
		// TODO Auto-generated method stub
		return this.paperSelectDAO.searchPaper();
	}
	public List<PaperSelectBean> searchPaperSelect(int studentid,
			String papername) {
		// TODO Auto-generated method stub
		return this.paperSelectDAO.searchPaperSelect(studentid, papername);
	}
	public PaperSelectBean findPaperSelectById(int id) {
		// TODO Auto-generated method stub
		return this.paperSelectDAO.findPaperSelectById(id);
	}
	public void updatePaperSelect(PaperSelectBean paperSelectBean) {
		// TODO Auto-generated method stub
		this.paperSelectDAO.updatePaperSelect(paperSelectBean);
	}
	public List<Integer> searchCourseid(int studentid) {
		// TODO Auto-generated method stub
		return this.paperSelectDAO.searchCourseid(studentid);
	}
	public List<PaperSelectBean> searchPaperSelect(int studentid, int courseid,
			String papername) {
		// TODO Auto-generated method stub
		return this.paperSelectDAO.searchPaperSelect(studentid, courseid, papername);
	}
	public List<PaperSelectBean> searchPaperSelect(int studentid,
			String papername, int studentanswer) {
		// TODO Auto-generated method stub
		return this.paperSelectDAO.searchPaperSelect(studentid, papername, studentanswer);
	}
}
