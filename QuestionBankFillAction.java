package com.online_examination_system.action;

import java.util.ArrayList;
import java.util.List;

import com.online_examination_system.bean.CourseBean;
import com.online_examination_system.bean.QuestionBankFillBean;
import com.online_examination_system.bean.TeacherBean;
import com.online_examination_system.service.CourseService;
import com.online_examination_system.service.QuestionBankFillService;
import com.online_examination_system.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class QuestionBankFillAction extends ActionSupport {
	private QuestionBankFillBean questionBankFillBean;
	
	private QuestionBankFillService questionBankFillService;
	private CourseService courseService;
	private TeacherService teacherService;
	
	private List<QuestionBankFillBean> listQuestionBankFillBean = new ArrayList<QuestionBankFillBean>();
	private List<CourseBean> listCourseBean = new ArrayList<CourseBean>();
	private List<TeacherBean> listTeacherBean = new ArrayList<TeacherBean>();

	public QuestionBankFillService getQuestionBankFillService() {
		return questionBankFillService;
	}
	public QuestionBankFillBean getQuestionBankFillBean() {
		return questionBankFillBean;
	}
	public void setQuestionBankFillBean(QuestionBankFillBean questionBankFillBean) {
		this.questionBankFillBean = questionBankFillBean;
	}
	public void setQuestionBankFillService(
			QuestionBankFillService questionBankFillService) {
		this.questionBankFillService = questionBankFillService;
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
	public List<QuestionBankFillBean> getListQuestionBankFillBean() {
		return listQuestionBankFillBean;
	}
	public void setListQuestionBankFillBean(
			List<QuestionBankFillBean> listQuestionBankFillBean) {
		this.listQuestionBankFillBean = listQuestionBankFillBean;
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
	//添加填空题
	public String addQuestionBankFill(){
		try {
			this.questionBankFillService
					.addQuestionBankFill(this.questionBankFillBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//查看所有课程与老师
	public String searchFillListCourse(){
		this.listCourseBean = this.courseService.findAllCourse();
		this.listTeacherBean = this.teacherService.findAllTeacher();
		return SUCCESS;
	}
	//查询填空题
	public String searchQuestionBankFill(){
		try {
			this.listCourseBean = this.courseService.findAllCourse();
			this.listQuestionBankFillBean = this.questionBankFillService
					.searchQuestionBankFill(this.questionBankFillBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//ID查询填空题
	public String findQuestionBankFillById(){
		this.questionBankFillBean = this.questionBankFillService.findQuestionBankFillById(this.questionBankFillBean.getId());
		this.listCourseBean = this.courseService.findAllCourse();
		return SUCCESS;
	}
	//更新填空题
	public String updateQuestionBankFill(){
		try {
			this.questionBankFillService
					.updateQuestionBankFill(this.questionBankFillBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//删除填空题
	public String deleteQuestionBankFill(){
		try {
			this.questionBankFillBean = this.questionBankFillService
					.findQuestionBankFillById(this.questionBankFillBean.getId());
			this.questionBankFillService
					.deleteQuestionBankFill(this.questionBankFillBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
