package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.PoliticsClassBean;
import com.online_examination_system.dao.PoliticsClassDAO;
import com.online_examination_system.service.PoliticsClassService;

public class PoliticsClassServiceImpl implements PoliticsClassService {
	private PoliticsClassDAO politicsClassDAO;

	public PoliticsClassDAO getPoliticsClassDAO() {
		return politicsClassDAO;
	}
	public void setPoliticsClassDAO(PoliticsClassDAO politicsClassDAO) {
		this.politicsClassDAO = politicsClassDAO;
	}
	public void addPoliticsClassBean(PoliticsClassBean politicsClassBean) {
		// TODO Auto-generated method stub
		this.politicsClassDAO.addPoliticsClassBean(politicsClassBean);
	}
	public List<PoliticsClassBean> searchPoliticsClass(
			PoliticsClassBean politicsClassBean) {
		// TODO Auto-generated method stub
		return this.politicsClassDAO.searchPoliticsClass(politicsClassBean);
	}
	public PoliticsClassBean findPoliticsClassById(int id) {
		// TODO Auto-generated method stub
		return this.politicsClassDAO.findPoliticsClassById(id);
	}
	public void updatePoliticsClass(PoliticsClassBean politicsClassBean) {
		// TODO Auto-generated method stub
		this.politicsClassDAO.updatePoliticsClass(politicsClassBean);
	}
	public void deletePoliticsClass(PoliticsClassBean politicsClassBean) {
		// TODO Auto-generated method stub
		this.politicsClassDAO.deletePoliticsClass(politicsClassBean);
	}
	public List<PoliticsClassBean> findAllPoliticsClass() {
		// TODO Auto-generated method stub
		return this.politicsClassDAO.findAllPoliticsClass();
	}
}
