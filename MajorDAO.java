package com.online_examination_system.dao;

import java.util.List;

import com.online_examination_system.bean.MajorBean;

public interface MajorDAO {
	public void addMajor(MajorBean majorBean);
	public List<MajorBean> findAllMajor();
	public List<MajorBean> findConditionMajor(int deptId);
	public void updateMajor(MajorBean majorBean);
	//ID查询专业
	public MajorBean findMajorById(int majorId);
	//删除专业
	public void deleteMajor(MajorBean majorBean);
}
