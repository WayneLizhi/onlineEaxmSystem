package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.MajorBean;
import com.online_examination_system.dao.MajorDAO;
import com.online_examination_system.service.MajorService;

public class MajorServiceImpl implements MajorService {
	
	private MajorDAO majorDAO;
	
	public MajorDAO getMajorDAO() {
		return majorDAO;
	}
	public void setMajorDAO(MajorDAO majorDAO) {
		this.majorDAO = majorDAO;
	}
	
	
	public void addMajor(MajorBean majorBean) {
		// TODO Auto-generated method stub
		this.majorDAO.addMajor(majorBean);
	}
	public List<MajorBean> findAllMajor() {
		// TODO Auto-generated method stub
		return this.majorDAO.findAllMajor();
	}
	public List<MajorBean> findConditionMajor(int deptId) {
		// TODO Auto-generated method stub
		return this.majorDAO.findConditionMajor(deptId);
	}
	public void updateMajor(MajorBean majorBean) {
		// TODO Auto-generated method stub
		this.majorDAO.updateMajor(majorBean);
	}
	//ID查询专业
	public MajorBean findMajorById(int majorId) {
		// TODO Auto-generated method stub
		return this.majorDAO.findMajorById(majorId);
	}
	//删除专业
	public void deleteMajor(MajorBean majorBean) {
		// TODO Auto-generated method stub
		this.majorDAO.deleteMajor(majorBean);
	}
}
