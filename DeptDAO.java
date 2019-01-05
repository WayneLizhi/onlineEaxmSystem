package com.online_examination_system.dao;

import java.util.List;

import com.online_examination_system.bean.DeptBean;

public interface DeptDAO {
	public void addDept(DeptBean deptBean);
	public List<DeptBean> findAllDept();
	public void deleteDept(DeptBean deptBean);
	public DeptBean findDeptById(int id);
	public void updateDept(DeptBean deptBean);
}
