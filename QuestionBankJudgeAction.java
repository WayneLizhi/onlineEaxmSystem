package com.online_examination_system.action;

import java.util.ArrayList;
import java.util.List;

import com.online_examination_system.bean.CourseBean;
import com.online_examination_system.bean.QuestionBankJudgeBean;
import com.online_examination_system.bean.TeacherBean;
import com.online_examination_system.service.CourseService;
import com.online_examination_system.service.QuestionBankJudgeService;
import com.online_examination_system.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class QuestionBankJudgeAction extends ActionSupport {
	private QuestionBankJudgeBean questionBankJudgeBean;
	
	private QuestionBankJudgeService questionBankJudgeService;
	private CourseService courseService;
	private TeacherService teacherService;
	
	private List<QuestionBankJudgeBean> listQuestionBankJudgeBean = new ArrayList<QuestionBankJudgeBean>();
	private List<CourseBean> listCourseBean = new ArrayList<CourseBean>();
	private List<TeacherBean> listTeacherBean = new ArrayList<TeacherBean>();

	public QuestionBankJudgeService getQuestionBankJudgeService() {
		return questionBankJudgeService;
	}
	public QuestionBankJudgeBean getQuestionBankJudgeBean() {
		return questionBankJudgeBean;
	}
	public void setQuestionBankJudgeBean(QuestionBankJudgeBean questionBankJudgeBean) {
		this.questionBankJudgeBean = questionBankJudgeBean;
	}
	public void setQuestionBankJudgeService(
			QuestionBankJudgeService questionBankJudgeService) {
		this.questionBankJudgeService = questionBankJudgeService;
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
	public List<QuestionBankJudgeBean> getListQuestionBankJudgeBean() {
		return listQuestionBankJudgeBean;
	}
	public void setListQuestionBankJudgeBean(
			List<QuestionBankJudgeBean> listQuestionBankJudgeBean) {
		this.listQuestionBankJudgeBean = listQuestionBankJudgeBean;
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
	//添加判断题
	public String addQuestionBankJudge(){
		try {
			this.questionBankJudgeService
					.addQuestionBankJudge(this.questionBankJudgeBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//查看所有课程与老师
	public String searchJudgeListCourse(){
		this.listCourseBean = this.courseService.findAllCourse();
		this.listTeacherBean = this.teacherService.findAllTeacher();
		return SUCCESS;
	}
	//查询判断题
	public String searchQuestionBankJudge(){
		try {
			this.listCourseBean = this.courseService.findAllCourse();
			this.listQuestionBankJudgeBean = this.questionBankJudgeService
					.searchQuestionBankJudge(this.questionBankJudgeBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//ID查询判断题
	public String findQuestionBankJudgeById(){
		this.questionBankJudgeBean = this.questionBankJudgeService.findQuestionBankJudgeById(this.questionBankJudgeBean.getId());
		this.listCourseBean = this.courseService.findAllCourse();
		return SUCCESS;
	}
	//更新判断题
	public String updateQuestionBankJudgeAction(){
		try {
			this.questionBankJudgeService
					.updateQuestionBankJudgeAction(this.questionBankJudgeBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//删除判断题
	public String deleteQuestionBankJudge(){
		this.questionBankJudgeBean = this.questionBankJudgeService.findQuestionBankJudgeById(this.questionBankJudgeBean.getId());
		this.questionBankJudgeService.deleteQuestionBankJudge(this.questionBankJudgeBean);
		return SUCCESS;
	}
}
