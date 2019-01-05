package com.online_examination_system.action;

import java.util.ArrayList;
import java.util.List;

import com.online_examination_system.bean.TeacherBean;
import com.online_examination_system.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TeacherAction extends ActionSupport {

	private TeacherService teacherService;
	private TeacherBean teacherBean;
	
	List<TeacherBean> listTeachser = new ArrayList<TeacherBean>();
	
	public TeacherService getTeacherService() {
		return teacherService;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	public TeacherBean getTeacherBean() {
		return teacherBean;
	}
	public void setTeacherBean(TeacherBean teacherBean) {
		this.teacherBean = teacherBean;
	}
	public List<TeacherBean> getListTeachser() {
		return listTeachser;
	}
	public void setListTeachser(List<TeacherBean> listTeachser) {
		this.listTeachser = listTeachser;
	}
	
	//添加老师
	public String addTeacher(){
		try{
			this.teacherService.addTeacher(this.teacherBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//列出所有教师
	public String listTeacher(){
		try {
			this.listTeachser = this.teacherService.findAllTeacher();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//ID查询教师
	public String findTeacherById(){
		this.teacherBean = this.teacherService.findTeacherById(this.teacherBean.getId());
		return SUCCESS;
	}
	//更新教师信息
	public String updateTeacher(){
		try {
			this.teacherService.updateTeacher(this.teacherBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//删除教师
	public String deleteTeacher(){
		try {
			this.teacherBean = this.teacherService
					.findTeacherById(this.teacherBean.getId());
			this.teacherService.deleteTeacher(this.teacherBean);
			return SUCCESS;
		}
		 catch (Exception e) {
			 e.printStackTrace();
			 return ERROR;
		 }
	}
}
