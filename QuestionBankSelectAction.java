package com.online_examination_system.action;

import java.util.ArrayList;
import java.util.List;

import com.online_examination_system.bean.CourseBean;
import com.online_examination_system.bean.QuestionBankSelectBean;
import com.online_examination_system.bean.TeacherBean;
import com.online_examination_system.service.CourseService;
import com.online_examination_system.service.QuestionBankSelectService;
import com.online_examination_system.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class QuestionBankSelectAction extends ActionSupport {
	private QuestionBankSelectBean questionBankSelectBean;
	private CourseBean courseBean;
	
	private QuestionBankSelectService questionBankSelectService;
	private CourseService courseService;
	private TeacherService teacherService;
	
	private List<QuestionBankSelectBean> listQuestionBankSelectBean = new ArrayList<QuestionBankSelectBean>();
	private List<CourseBean> listCourseBean = new ArrayList<CourseBean>();
	private List<TeacherBean> listTeacherBean = new ArrayList<TeacherBean>();

	public QuestionBankSelectService getQuestionBankSelectService() {
		return questionBankSelectService;
	}
	public QuestionBankSelectBean getQuestionBankSelectBean() {
		return questionBankSelectBean;
	}
	public void setQuestionBankSelectBean(
			QuestionBankSelectBean questionBankSelectBean) {
		this.questionBankSelectBean = questionBankSelectBean;
	}
	public CourseBean getCourseBean() {
		return courseBean;
	}
	public void setCourseBean(CourseBean courseBean) {
		this.courseBean = courseBean;
	}
	public void setQuestionBankSelectService(
			QuestionBankSelectService questionBankSelectService) {
		this.questionBankSelectService = questionBankSelectService;
	}
	public CourseService getCourseService() {
		return courseService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	public TeacherService getTeacherService() {
		return teacherService;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	public List<CourseBean> getListCourseBean() {
		return listCourseBean;
	}
	public List<QuestionBankSelectBean> getListQuestionBankSelectBean() {
		return listQuestionBankSelectBean;
	}
	public void setListQuestionBankSelectBean(
			List<QuestionBankSelectBean> listQuestionBankSelectBean) {
		this.listQuestionBankSelectBean = listQuestionBankSelectBean;
	}
	public void setListCourseBean(List<CourseBean> listCourseBean) {
		this.listCourseBean = listCourseBean;
	}
	public List<TeacherBean> getListTeacherBean() {
		return listTeacherBean;
	}
	public void setListTeacherBean(List<TeacherBean> listTeacherBean) {
		this.listTeacherBean = listTeacherBean;
	}
	
	//查找所有课程
	public String listCourse(){
		this.listCourseBean = this.courseService.findAllCourse();
		return SUCCESS;
	}
	//添加选择题
	public String addQuestionBankSelect(){
		try {
			this.questionBankSelectService
					.addQuestionBankSelect(this.questionBankSelectBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//查询选择题
	public String searchQuestionBankSelect(){
		try {
			this.listCourseBean = this.courseService.findAllCourse();
			this.listQuestionBankSelectBean = this.questionBankSelectService
					.searchQuestionBankSelect(this.questionBankSelectBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//查找所有课程与老师
	public String listCourseTeacher(){
		this.listCourseBean = this.courseService.findAllCourse();
		this.listTeacherBean = this.teacherService.findAllTeacher();
		return SUCCESS;
	}
	//ID查找选择题
	public String findQuestionBankSelectById(){
		try {
			this.listCourseBean = this.courseService.findAllCourse();
			this.questionBankSelectBean = this.questionBankSelectService
					.findQuestionBankSelectById(this.questionBankSelectBean
							.getId());
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//更新选择题
	public String updateQuestionBankSelect(){
		try {
			this.questionBankSelectService
					.updateQuestionBankSelect(this.questionBankSelectBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//删除选择题
	public String deleteQuestionBankSelect(){
		try {
			this.questionBankSelectBean = this.questionBankSelectService
					.findQuestionBankSelectById(this.questionBankSelectBean
							.getId());
			this.questionBankSelectService
					.deleteQuestionBankSelect(this.questionBankSelectBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
