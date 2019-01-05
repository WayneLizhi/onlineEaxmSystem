package com.online_examination_system.action;

import java.util.ArrayList;
import java.util.List;

import com.online_examination_system.bean.PoliticsClassBean;
import com.online_examination_system.bean.StudentBean;
import com.online_examination_system.service.PoliticsClassService;
import com.online_examination_system.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class StudentAction extends ActionSupport {
	
	private StudentService studentService;
	private PoliticsClassService politicsClassService;
	
	private StudentBean studentBean;
	
	List<PoliticsClassBean> listPoliticsClassBean = new ArrayList<PoliticsClassBean>();
	List<StudentBean> listStudentBean = new ArrayList<StudentBean>();

	public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public PoliticsClassService getPoliticsClassService() {
		return politicsClassService;
	}
	public void setPoliticsClassService(PoliticsClassService politicsClassService) {
		this.politicsClassService = politicsClassService;
	}
	public StudentBean getStudentBean() {
		return studentBean;
	}
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	public List<PoliticsClassBean> getListPoliticsClassBean() {
		return listPoliticsClassBean;
	}
	public void setListPoliticsClassBean(
			List<PoliticsClassBean> listPoliticsClassBean) {
		this.listPoliticsClassBean = listPoliticsClassBean;
	}
	public List<StudentBean> getListStudentBean() {
		return listStudentBean;
	}
	public void setListStudentBean(List<StudentBean> listStudentBean) {
		this.listStudentBean = listStudentBean;
	}
	//列出班级信息
	public String listPoliticsClass(){
		this.listPoliticsClassBean = this.politicsClassService.findAllPoliticsClass();
		return SUCCESS;
	}
	//添加学生
	public String addStudent(){
		try {
			this.studentService.addStudentBean(this.studentBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//查找学生
	public String searchStudent(){
		try{
			this.listStudentBean = this.studentService
					.searchStudentBean(this.studentBean);
			this.listPoliticsClassBean = this.politicsClassService
					.findAllPoliticsClass();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//ID查找学生
	public String findStudentById(){
		this.studentBean = this.studentService.findStudentById(this.studentBean.getId());
		this.listPoliticsClassBean = this.politicsClassService.findAllPoliticsClass();
		return SUCCESS;
	}
	//更新学生
	public String updateStudent(){
		try {
			this.studentService.updateStudent(this.studentBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//删除学生
	public String deleteStudent(){
		try {
			this.studentBean = this.studentService
					.findStudentById(this.studentBean.getId());
			this.studentService.deleteStudent(this.studentBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
