package com.online_examination_system.service.impl;

import java.util.List;

import com.online_examination_system.bean.DeptBean;
import com.online_examination_system.dao.DeptDAO;
import com.online_examination_system.service.DeptService;

public class DeptServiceImpl implements DeptService {
	
	private DeptDAO deptDao;
	
	public DeptDAO getDeptDao() {
		return deptDao;
	}
	public void setDeptDao(DeptDAO deptDao) {
		this.deptDao = deptDao;
	}

	public void addDept(DeptBean deptBean) {
		// TODO Auto-generated method stub
		this.deptDao.addDept(deptBean);
	}
	public List<DeptBean> findAllDept() {
		// TODO Auto-generated method stub
		return this.deptDao.findAllDept();
	}
	public void deleteDept(DeptBean deptBean) {
		// TODO Auto-generated method stub
		this.deptDao.deleteDept(deptBean);
	}
	public DeptBean findDeptById(int id) {
		// TODO Auto-generated method stub
		return this.deptDao.findDeptById(id);
	}
	public void updateDept(DeptBean deptBean) {
		// TODO Auto-generated method stub
		this.deptDao.updateDept(deptBean);
	}
}
