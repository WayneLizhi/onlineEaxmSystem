package com.online_examination_system.action;

import java.util.ArrayList;
import java.util.List;

import com.online_examination_system.bean.CourseBean;
import com.online_examination_system.bean.QuestionBankShortAnswerBean;
import com.online_examination_system.bean.TeacherBean;
import com.online_examination_system.service.CourseService;
import com.online_examination_system.service.QuestionBankShortAnswerService;
import com.online_examination_system.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class QuestionBankShortAnswerAction extends ActionSupport {
	private QuestionBankShortAnswerBean questionBankShortAnswerBean;
	
	private QuestionBankShortAnswerService questionBankShortAnswerService;
	private CourseService courseService;
	private TeacherService teacherService;
	
	private List<QuestionBankShortAnswerBean> listQuestionBankShortAnswerBean = new ArrayList<QuestionBankShortAnswerBean>();
	private List<CourseBean> listCourseBean = new ArrayList<CourseBean>();
	private List<TeacherBean> listTeacherBean = new ArrayList<TeacherBean>();

	public QuestionBankShortAnswerService getQuestionBankShortAnswerService() {
		return questionBankShortAnswerService;
	}
	public QuestionBankShortAnswerBean getQuestionBankShortAnswerBean() {
		return questionBankShortAnswerBean;
	}
	public void setQuestionBankShortAnswerBean(
			QuestionBankShortAnswerBean questionBankShortAnswerBean) {
		this.questionBankShortAnswerBean = questionBankShortAnswerBean;
	}
	public void setQuestionBankShortAnswerService(
			QuestionBankShortAnswerService questionBankShortAnswerService) {
		this.questionBankShortAnswerService = questionBankShortAnswerService;
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
	public List<QuestionBankShortAnswerBean> getListQuestionBankShortAnswerBean() {
		return listQuestionBankShortAnswerBean;
	}
	public void setListQuestionBankShortAnswerBean(
			List<QuestionBankShortAnswerBean> listQuestionBankShortAnswerBean) {
		this.listQuestionBankShortAnswerBean = listQuestionBankShortAnswerBean;
	}
	public List<CourseBean> getListCourseBean() {
		return listCourseBean;
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
	//添加简答题
	public String addQuestionBankShortAnswer(){
		try {
			this.questionBankShortAnswerService
					.addQuestionBankShortAnswer(this.questionBankShortAnswerBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//查找所有课程与老师
	public String searchShortAnswerListCourse(){
		this.listCourseBean = this.courseService.findAllCourse();
		this.listTeacherBean = this.teacherService.findAllTeacher();
		return SUCCESS;
	}
	//查询简答题
	public String searchQuestionBankShortAnswer(){
		try {
			this.listQuestionBankShortAnswerBean = this.questionBankShortAnswerService
					.searchQuestionBankShortAnswer(this.questionBankShortAnswerBean);
			this.listCourseBean = this.courseService.findAllCourse();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//ID查询简答题
	public String findQuestionBankShortAnswerById(){
		this.questionBankShortAnswerBean = this.questionBankShortAnswerService.findQuestionBankShortAnswerById(this.questionBankShortAnswerBean.getId());
		this.listCourseBean = this.courseService.findAllCourse();
		return SUCCESS;
	}
	//更新简答题
	public String updateQuestionBankShortAnswer(){
		try {
			this.questionBankShortAnswerService
					.updateQuestionBankShortAnswer(this.questionBankShortAnswerBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//删除简答题
	public String deleteQuestionBankShortAnswer(){
		try {
			this.questionBankShortAnswerBean = this.questionBankShortAnswerService
					.findQuestionBankShortAnswerById(this.questionBankShortAnswerBean
							.getId());
			this.questionBankShortAnswerService
					.deleteQuestionBankShortAnswer(this.questionBankShortAnswerBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
