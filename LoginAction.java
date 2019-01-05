package com.online_examination_system.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.online_examination_system.bean.StudentBean;
import com.online_examination_system.bean.TeacherBean;
import com.online_examination_system.service.StudentService;
import com.online_examination_system.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction  extends ActionSupport {
	
	private String username;
	private String password;
	private String userClass;
	
	private StudentService studentService;
	private TeacherService teacherService;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserClass() {
		return userClass;
	}
	public void setUserClass(String userClass) {
		this.userClass = userClass;
	}
	public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public TeacherService getTeacherService() {
		return teacherService;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	public String login(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		List<StudentBean> listStudentBean = new ArrayList<StudentBean>();
		List<TeacherBean> listTeacherBean = new ArrayList<TeacherBean>();
		StudentBean studentBean = null;
		TeacherBean teacherBean = null;
		
		String hql = "";
		if(this.userClass.equals("student")){
			hql = hql + "from StudentBean studentBean where studentBean.sno='" + this.username + "'" + " and studentBean.password='" + this.password + "'";
			try {
				listStudentBean = this.studentService.findStudentByHql(hql);
			} catch (Exception e) {
				// TODO: handle exception
				return ERROR;
			}
			
			if(listStudentBean.size() == 0){
				return ERROR;
			}
			studentBean = listStudentBean.get(0);
			session.setAttribute("user", studentBean);
		} else {
			hql = hql + "from TeacherBean teacherBean where teacherBean.tno='" + this.username + "'" + " and teacherBean.password='" + this.password + "'";
			try {
				listTeacherBean = this.teacherService.findTeacherByHql(hql);
			} catch (Exception e) {
				// TODO: handle exception
				return ERROR;
			}
			
			if(listTeacherBean.size() == 0){
				return ERROR;
			}
			teacherBean = listTeacherBean.get(0);
			session.setAttribute("user", teacherBean);
		}
		return SUCCESS;
	}
	public String exit(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return SUCCESS;
	}
}
