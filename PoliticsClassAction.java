package com.online_examination_system.action;

import java.util.ArrayList;
import java.util.List;

import com.online_examination_system.bean.MajorBean;
import com.online_examination_system.bean.PoliticsClassBean;
import com.online_examination_system.bean.TeacherBean;
import com.online_examination_system.service.MajorService;
import com.online_examination_system.service.PoliticsClassService;
import com.online_examination_system.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class PoliticsClassAction extends ActionSupport {
	private PoliticsClassService politicsClassService;
	private MajorService majorService;
	private TeacherService teacherService;
	private PoliticsClassBean politicsClassBean;
	
	List<MajorBean> listMajorBean = new ArrayList<MajorBean>();
	List<TeacherBean> listTeacherBean = new ArrayList<TeacherBean>();
	List<PoliticsClassBean> listPoliticsClassBean = new ArrayList<PoliticsClassBean>();

	public PoliticsClassService getPoliticsClassService() {
		return politicsClassService;
	}
	public void setPoliticsClassService(PoliticsClassService politicsClassService) {
		this.politicsClassService = politicsClassService;
	}
	public MajorService getMajorService() {
		return majorService;
	}
	public void setMajorService(MajorService majorService) {
		this.majorService = majorService;
	}
	public TeacherService getTeacherService() {
		return teacherService;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	public PoliticsClassBean getPoliticsClassBean() {
		return politicsClassBean;
	}
	public void setPoliticsClassBean(PoliticsClassBean politicsClassBean) {
		this.politicsClassBean = politicsClassBean;
	}
	public List<MajorBean> getListMajorBean() {
		return listMajorBean;
	}
	public void setListMajorBean(List<MajorBean> listMajorBean) {
		this.listMajorBean = listMajorBean;
	}
	public List<TeacherBean> getListTeacherBean() {
		return listTeacherBean;
	}
	public void setListTeacherBean(List<TeacherBean> listTeacherBean) {
		this.listTeacherBean = listTeacherBean;
	}
	public List<PoliticsClassBean> getListPoliticsClassBean() {
		return listPoliticsClassBean;
	}
	public void setListPoliticsClassBean(
			List<PoliticsClassBean> listPoliticsClassBean) {
		this.listPoliticsClassBean = listPoliticsClassBean;
	}
	
	//添加班级信息
	public String addPoliticsClass(){
		try{
			this.politicsClassService.addPoliticsClassBean(this.politicsClassBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//列出所有专业、老师信息
	public String listMajorTeacher(){
		this.listMajorBean = this.majorService.findAllMajor();
		this.listTeacherBean = this.teacherService.findAllTeacher();
		return SUCCESS;
	}
	//查找专业
	public String searchPoliticsClass(){
		try{
			this.listMajorBean = this.majorService.findAllMajor();
			this.listTeacherBean = this.teacherService.findAllTeacher();
			this.listPoliticsClassBean = this.politicsClassService
					.searchPoliticsClass(this.politicsClassBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//ID查找班级
	public String findPoliticsClassById(){
		this.listMajorBean = this.majorService.findAllMajor();
		this.listTeacherBean = this.teacherService.findAllTeacher();
		this.politicsClassBean = this.politicsClassService.findPoliticsClassById(this.politicsClassBean.getId());
		return SUCCESS;
	}
	//更新班级信息
	public String updatePoliticsClass(){
		try {
			this.politicsClassService
					.updatePoliticsClass(this.politicsClassBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//删除班级
	public String deletePoliticsClass(){
		try {
			this.politicsClassBean = this.politicsClassService
					.findPoliticsClassById(this.politicsClassBean.getId());
			this.politicsClassService
					.deletePoliticsClass(this.politicsClassBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
