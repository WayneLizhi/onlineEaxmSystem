package com.online_examination_system.service;

import java.util.List;

import com.online_examination_system.bean.PoliticsClassBean;

public interface PoliticsClassService {
	//添加班级信息
	public void addPoliticsClassBean(PoliticsClassBean politicsClassBean);
	//查找班级
	public List<PoliticsClassBean> searchPoliticsClass(PoliticsClassBean politicsClassBean);
	//ID查找班级
	public PoliticsClassBean findPoliticsClassById(int id);
	//更新班级信息
	public void updatePoliticsClass(PoliticsClassBean politicsClassBean);
	//删除班级
	public void deletePoliticsClass(PoliticsClassBean politicsClassBean);
	//查找所有班级
	public List<PoliticsClassBean> findAllPoliticsClass();
}
