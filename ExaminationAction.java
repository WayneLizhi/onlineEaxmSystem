package com.online_examination_system.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.online_examination_system.bean.CourseBean;
import com.online_examination_system.bean.GradeBean;
import com.online_examination_system.bean.PaperFillBean;
import com.online_examination_system.bean.PaperJudgeBean;
import com.online_examination_system.bean.PaperSelectBean;
import com.online_examination_system.bean.PaperShortAnswerBean;
import com.online_examination_system.bean.QuestionBankFillBean;
import com.online_examination_system.bean.QuestionBankJudgeBean;
import com.online_examination_system.bean.QuestionBankSelectBean;
import com.online_examination_system.bean.QuestionBankShortAnswerBean;
import com.online_examination_system.bean.StudentBean;
import com.online_examination_system.service.CourseService;
import com.online_examination_system.service.PaperFillService;
import com.online_examination_system.service.PaperJudgeService;
import com.online_examination_system.service.PaperSelectService;
import com.online_examination_system.service.PaperShortAnswerService;
import com.online_examination_system.service.QuestionBankFillService;
import com.online_examination_system.service.QuestionBankJudgeService;
import com.online_examination_system.service.QuestionBankSelectService;
import com.online_examination_system.service.QuestionBankShortAnswerService;
import com.online_examination_system.service.StudentService;
import com.online_examination_system.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ExaminationAction extends ActionSupport {
	private String paperName;
	private int courseid;
	private int selectNumber;
	private int selectScore;
	private int judgeNumber;
	private int judgeScore;
	private int fillNumber;
	private int fillScore;
	private int shortAnswerNumber;
	private int shortAnswerScore;
	private int studentid;
	private int index = 0;
	private int listsize = 0;
	private String QuestionType;
	
	private PaperSelectBean paperSelectBean;
	private PaperJudgeBean paperJudgeBean;
	private PaperFillBean paperFillBean;
	private PaperShortAnswerBean paperShortAnswerBean;
	private StudentBean studentBean;
	
	private QuestionBankSelectBean questionBankSelectBean;
	private QuestionBankJudgeBean questionBankJudgeBean;
	private QuestionBankFillBean questionBankFillBean;
	private QuestionBankShortAnswerBean questionBankShortAnswerBean;
	
	private QuestionBankFillService questionBankFillService;
	private QuestionBankJudgeService questionBankJudgeService;
	private QuestionBankSelectService questionBankSelectService;
	private QuestionBankShortAnswerService questionBankShortAnswerService;
	private TeacherService teacherService;
	private StudentService studentService;
	private CourseService courseService;
	private PaperFillService paperFillService;
	private PaperJudgeService paperJudgeService;
	private PaperSelectService paperSelectService;
	private PaperShortAnswerService paperShortAnswerService;
	
	private List<CourseBean> listCourseBean = new ArrayList<CourseBean>();
	private List<Integer> listcourseid = new ArrayList<Integer>();
	private List<GradeBean> listGradeBean = new ArrayList<GradeBean>();
	private List<QuestionBankSelectBean> listQuestionBankSelectBean = new ArrayList<QuestionBankSelectBean>();
	private List<QuestionBankJudgeBean> listQuestionBankJudgeBean = new ArrayList<QuestionBankJudgeBean>();
	private List<QuestionBankFillBean> listQuestionBankFillBean = new ArrayList<QuestionBankFillBean>();
	private List<QuestionBankShortAnswerBean> listQuestionBankShortAnswerBeans = new ArrayList<QuestionBankShortAnswerBean>();
	
	private List<PaperSelectBean> listPaperSelectBean = new ArrayList<PaperSelectBean>();
	private List<PaperJudgeBean> listPaperJudgeBean = new ArrayList<PaperJudgeBean>();
	private List<PaperFillBean> listPaperFillBean = new ArrayList<PaperFillBean>();
	private List<PaperShortAnswerBean> listPaperShortAnswerBean = new ArrayList<PaperShortAnswerBean>();
	
	private List<String> listPaperName = new ArrayList<String>();
	
	private List<StudentBean> listStudentBean = new ArrayList<StudentBean>();
	
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpSession session = request.getSession();
	
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public int getSelectNumber() {
		return selectNumber;
	}
	public void setSelectNumber(int selectNumber) {
		this.selectNumber = selectNumber;
	}
	public int getSelectScore() {
		return selectScore;
	}
	public void setSelectScore(int selectScore) {
		this.selectScore = selectScore;
	}
	public int getJudgeNumber() {
		return judgeNumber;
	}
	public void setJudgeNumber(int judgeNumber) {
		this.judgeNumber = judgeNumber;
	}
	public int getJudgeScore() {
		return judgeScore;
	}
	public void setJudgeScore(int judgeScore) {
		this.judgeScore = judgeScore;
	}
	public int getFillNumber() {
		return fillNumber;
	}
	public void setFillNumber(int fillNumber) {
		this.fillNumber = fillNumber;
	}
	public int getFillScore() {
		return fillScore;
	}
	public void setFillScore(int fillScore) {
		this.fillScore = fillScore;
	}
	public int getShortAnswerNumber() {
		return shortAnswerNumber;
	}
	public void setShortAnswerNumber(int shortAnswerNumber) {
		this.shortAnswerNumber = shortAnswerNumber;
	}
	public int getShortAnswerScore() {
		return shortAnswerScore;
	}
	public void setShortAnswerScore(int shortAnswerScore) {
		this.shortAnswerScore = shortAnswerScore;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getListsize() {
		return listsize;
	}
	public void setListsize(int listsize) {
		this.listsize = listsize;
	}
	public String getQuestionType() {
		return QuestionType;
	}
	public void setQuestionType(String questionType) {
		QuestionType = questionType;
	}
	public PaperSelectBean getPaperSelectBean() {
		return paperSelectBean;
	}
	public void setPaperSelectBean(PaperSelectBean paperSelectBean) {
		this.paperSelectBean = paperSelectBean;
	}
	public PaperJudgeBean getPaperJudgeBean() {
		return paperJudgeBean;
	}
	public void setPaperJudgeBean(PaperJudgeBean paperJudgeBean) {
		this.paperJudgeBean = paperJudgeBean;
	}
	public PaperFillBean getPaperFillBean() {
		return paperFillBean;
	}
	public void setPaperFillBean(PaperFillBean paperFillBean) {
		this.paperFillBean = paperFillBean;
	}
	public PaperShortAnswerBean getPaperShortAnswerBean() {
		return paperShortAnswerBean;
	}
	public void setPaperShortAnswerBean(PaperShortAnswerBean paperShortAnswerBean) {
		this.paperShortAnswerBean = paperShortAnswerBean;
	}
	public StudentBean getStudentBean() {
		return studentBean;
	}
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	public QuestionBankSelectBean getQuestionBankSelectBean() {
		return questionBankSelectBean;
	}
	public void setQuestionBankSelectBean(
			QuestionBankSelectBean questionBankSelectBean) {
		this.questionBankSelectBean = questionBankSelectBean;
	}
	public QuestionBankJudgeBean getQuestionBankJudgeBean() {
		return questionBankJudgeBean;
	}
	public void setQuestionBankJudgeBean(QuestionBankJudgeBean questionBankJudgeBean) {
		this.questionBankJudgeBean = questionBankJudgeBean;
	}
	public QuestionBankFillBean getQuestionBankFillBean() {
		return questionBankFillBean;
	}
	public void setQuestionBankFillBean(QuestionBankFillBean questionBankFillBean) {
		this.questionBankFillBean = questionBankFillBean;
	}
	public QuestionBankShortAnswerBean getQuestionBankShortAnswerBean() {
		return questionBankShortAnswerBean;
	}
	public void setQuestionBankShortAnswerBean(
			QuestionBankShortAnswerBean questionBankShortAnswerBean) {
		this.questionBankShortAnswerBean = questionBankShortAnswerBean;
	}
	public QuestionBankFillService getQuestionBankFillService() {
		return questionBankFillService;
	}
	public void setQuestionBankFillService(
			QuestionBankFillService questionBankFillService) {
		this.questionBankFillService = questionBankFillService;
	}
	public QuestionBankJudgeService getQuestionBankJudgeService() {
		return questionBankJudgeService;
	}
	public void setQuestionBankJudgeService(
			QuestionBankJudgeService questionBankJudgeService) {
		this.questionBankJudgeService = questionBankJudgeService;
	}
	public QuestionBankSelectService getQuestionBankSelectService() {
		return questionBankSelectService;
	}
	public void setQuestionBankSelectService(
			QuestionBankSelectService questionBankSelectService) {
		this.questionBankSelectService = questionBankSelectService;
	}
	public QuestionBankShortAnswerService getQuestionBankShortAnswerService() {
		return questionBankShortAnswerService;
	}
	public void setQuestionBankShortAnswerService(
			QuestionBankShortAnswerService questionBankShortAnswerService) {
		this.questionBankShortAnswerService = questionBankShortAnswerService;
	}
	public TeacherService getTeacherService() {
		return teacherService;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public CourseService getCourseService() {
		return courseService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	public PaperFillService getPaperFillService() {
		return paperFillService;
	}
	public void setPaperFillService(PaperFillService paperFillService) {
		this.paperFillService = paperFillService;
	}
	public PaperJudgeService getPaperJudgeService() {
		return paperJudgeService;
	}
	public void setPaperJudgeService(PaperJudgeService paperJudgeService) {
		this.paperJudgeService = paperJudgeService;
	}
	public PaperSelectService getPaperSelectService() {
		return paperSelectService;
	}
	public void setPaperSelectService(PaperSelectService paperSelectService) {
		this.paperSelectService = paperSelectService;
	}
	public PaperShortAnswerService getPaperShortAnswerService() {
		return paperShortAnswerService;
	}
	public void setPaperShortAnswerService(
			PaperShortAnswerService paperShortAnswerService) {
		this.paperShortAnswerService = paperShortAnswerService;
	}
	public List<CourseBean> getListCourseBean() {
		return listCourseBean;
	}
	public void setListCourseBean(List<CourseBean> listCourseBean) {
		this.listCourseBean = listCourseBean;
	}
	public List<Integer> getListcourseid() {
		return listcourseid;
	}
	public void setListcourseid(List<Integer> listcourseid) {
		this.listcourseid = listcourseid;
	}
	public List<GradeBean> getListGradeBean() {
		return listGradeBean;
	}
	public void setListGradeBean(List<GradeBean> listGradeBean) {
		this.listGradeBean = listGradeBean;
	}
	public List<QuestionBankSelectBean> getListQuestionBankSelectBean() {
		return listQuestionBankSelectBean;
	}
	public void setListQuestionBankSelectBean(
			List<QuestionBankSelectBean> listQuestionBankSelectBean) {
		this.listQuestionBankSelectBean = listQuestionBankSelectBean;
	}
	public List<QuestionBankJudgeBean> getListQuestionBankJudgeBean() {
		return listQuestionBankJudgeBean;
	}
	public void setListQuestionBankJudgeBean(
			List<QuestionBankJudgeBean> listQuestionBankJudgeBean) {
		this.listQuestionBankJudgeBean = listQuestionBankJudgeBean;
	}
	public List<QuestionBankFillBean> getListQuestionBankFillBean() {
		return listQuestionBankFillBean;
	}
	public void setListQuestionBankFillBean(
			List<QuestionBankFillBean> listQuestionBankFillBean) {
		this.listQuestionBankFillBean = listQuestionBankFillBean;
	}
	public List<QuestionBankShortAnswerBean> getListQuestionBankShortAnswerBeans() {
		return listQuestionBankShortAnswerBeans;
	}
	public void setListQuestionBankShortAnswerBeans(
			List<QuestionBankShortAnswerBean> listQuestionBankShortAnswerBeans) {
		this.listQuestionBankShortAnswerBeans = listQuestionBankShortAnswerBeans;
	}
	public List<PaperSelectBean> getListPaperSelectBean() {
		return listPaperSelectBean;
	}
	public void setListPaperSelectBean(List<PaperSelectBean> listPaperSelectBean) {
		this.listPaperSelectBean = listPaperSelectBean;
	}
	public List<PaperJudgeBean> getListPaperJudgeBean() {
		return listPaperJudgeBean;
	}
	public void setListPaperJudgeBean(List<PaperJudgeBean> listPaperJudgeBean) {
		this.listPaperJudgeBean = listPaperJudgeBean;
	}
	public List<PaperFillBean> getListPaperFillBean() {
		return listPaperFillBean;
	}
	public void setListPaperFillBean(List<PaperFillBean> listPaperFillBean) {
		this.listPaperFillBean = listPaperFillBean;
	}
	public List<PaperShortAnswerBean> getListPaperShortAnswerBean() {
		return listPaperShortAnswerBean;
	}
	public void setListPaperShortAnswerBean(
			List<PaperShortAnswerBean> listPaperShortAnswerBean) {
		this.listPaperShortAnswerBean = listPaperShortAnswerBean;
	}
	public List<String> getListPaperName() {
		return listPaperName;
	}
	public void setListPaperName(List<String> listPaperName) {
		this.listPaperName = listPaperName;
	}
	public List<StudentBean> getListStudentBean() {
		return listStudentBean;
	}
	public void setListStudentBean(List<StudentBean> listStudentBean) {
		this.listStudentBean = listStudentBean;
	}
	//查询所有课程
	public String createPaperListCourse(){
		this.listCourseBean = this.courseService.findAllCourse();
		return SUCCESS;
	}
	//生成试卷
	public String createPaper(){
		int n = 0;
		int listStudentBeanSize = 0;
		int studentBeanid;
		int selectNumber = 0, judgeNumber = 0, fillNumber = 0, shortAnswerNumber = 0;
		@SuppressWarnings("unused")
		String studentBeanSno = "";
		Random random = new Random();
		
		QuestionBankSelectBean questionBankSelectBean = new QuestionBankSelectBean();
		QuestionBankJudgeBean questionBankJudgeBean = new QuestionBankJudgeBean();
		QuestionBankFillBean questionBankFillBean = new QuestionBankFillBean();
		QuestionBankShortAnswerBean questionBankShortAnswerBean = new QuestionBankShortAnswerBean();
		
		PaperSelectBean paperSelectBean = new PaperSelectBean();
		PaperJudgeBean paperJudgeBean = new PaperJudgeBean();
		PaperFillBean paperFillBean = new PaperFillBean();
		PaperShortAnswerBean paperShortAnswerBean = new PaperShortAnswerBean();
		
		this.questionBankSelectBean = new QuestionBankSelectBean();
		this.questionBankSelectBean.setCourseid(this.courseid);
		this.questionBankSelectBean.setQuestion("");
		this.questionBankSelectBean.setTeachername("");
		
		this.questionBankJudgeBean = new QuestionBankJudgeBean();
		this.questionBankJudgeBean.setCourseid(this.courseid);
		this.questionBankJudgeBean.setQuestion("");
		this.questionBankJudgeBean.setTeachername("");
		
		this.questionBankFillBean = new QuestionBankFillBean();
		this.questionBankFillBean.setCourseid(this.courseid);
		this.questionBankFillBean.setQuestion("");
		this.questionBankFillBean.setTeachername("");
		
		this.questionBankShortAnswerBean = new QuestionBankShortAnswerBean();
		this.questionBankShortAnswerBean.setCourseid(this.courseid);
		this.questionBankShortAnswerBean.setQuestion("");
		this.questionBankShortAnswerBean.setTearchername("");
		
		this.listQuestionBankSelectBean = this.questionBankSelectService.searchQuestionBankSelect(this.questionBankSelectBean);
		this.listQuestionBankJudgeBean = this.questionBankJudgeService.searchQuestionBankJudge(this.questionBankJudgeBean);
		this.listQuestionBankFillBean = this.questionBankFillService.searchQuestionBankFill(this.questionBankFillBean);
		this.listQuestionBankShortAnswerBeans = this.questionBankShortAnswerService.searchQuestionBankShortAnswer(this.questionBankShortAnswerBean);
		
		this.listStudentBean = this.studentService.findStudentByHql("from StudentBean studentBean");
		listStudentBeanSize = this.listStudentBean.size();
		
		selectNumber = this.selectNumber;
		//生成试卷选择题
		while (selectNumber != 0){
			n = random.nextInt(this.listQuestionBankSelectBean.size());
			questionBankSelectBean = this.listQuestionBankSelectBean.get(n);
			this.listQuestionBankSelectBean.remove(n);
			
			paperSelectBean.setPapername(this.paperName);
			paperSelectBean.setQuestion(questionBankSelectBean.getQuestion());
			paperSelectBean.setModelanswer(questionBankSelectBean.getAnswer());
			paperSelectBean.setTeachername("0000");
			paperSelectBean.setCourseid(this.courseid);
			paperSelectBean.setStudentanswer(0);
			paperSelectBean.setScore(this.selectScore);
			
			for (int i = 0; i < listStudentBeanSize; i++) {
				studentBeanid = listStudentBean.get(i).getId();
				studentBeanSno = listStudentBean.get(i).getSno();
				paperSelectBean.setStudentid(studentBeanid);
				/*if(studentBeanSno.equals("00000000000")){
					paperSelectBean.setScore(this.selectScore);
				} else {
					paperSelectBean.setScore(0);
				}*/
				this.paperSelectService.addPaperSelect(paperSelectBean);
			}
			selectNumber--;
		}
		
		judgeNumber = this.judgeNumber;
		//生成试卷判断题
		while (judgeNumber != 0){
			n = random.nextInt(this.listQuestionBankJudgeBean.size());
			questionBankJudgeBean = this.listQuestionBankJudgeBean.get(n);
			this.listQuestionBankJudgeBean.remove(n);
			
			paperJudgeBean.setPapername(this.paperName);
			paperJudgeBean.setQuestion(questionBankJudgeBean.getQuestion());
			paperJudgeBean.setModelanswer(questionBankJudgeBean.getAnswer());
			paperJudgeBean.setTeachername("0000");
			paperJudgeBean.setCourseid(this.courseid);
			paperJudgeBean.setStudentanswer(0);
			paperJudgeBean.setScore(this.judgeScore);
			
			for (int i = 0; i < listStudentBeanSize; i++) {
				studentBeanid = listStudentBean.get(i).getId();
				studentBeanSno = listStudentBean.get(i).getSno();
				paperJudgeBean.setStudentid(studentBeanid);
				/*if(studentBeanSno.equals("00000000000")){
					paperJudgeBean.setScore(this.judgeScore);
				} else {
					paperJudgeBean.setScore(0);
				}*/
				this.paperJudgeService.addPaperJudge(paperJudgeBean);
			}
			judgeNumber--;
		}
		
		fillNumber = this.fillNumber;
		//生成试卷填空题
		while (fillNumber != 0){
			n = random.nextInt(this.listQuestionBankFillBean.size());
			questionBankFillBean = this.listQuestionBankFillBean.get(n);
			this.listQuestionBankFillBean.remove(n);
			
			paperFillBean.setPapername(this.paperName);
			paperFillBean.setQuestion(questionBankFillBean.getQuestion());
			paperFillBean.setModelanswer(questionBankFillBean.getAnswer());
			paperFillBean.setTeachername("0000");
			paperFillBean.setCourseid(this.courseid);
			paperFillBean.setStudentanswer("");
			paperFillBean.setScore(this.fillScore);
			
			for (int i = 0; i < listStudentBeanSize; i++) {
				studentBeanid = listStudentBean.get(i).getId();
				studentBeanSno = listStudentBean.get(i).getSno();
				paperFillBean.setStudentid(studentBeanid);
				/*if(studentBeanSno.equals("00000000000")){
					paperFillBean.setScore(this.fillScore);
				} else {
					paperFillBean.setScore(0);
				}*/
				this.paperFillService.addPaperFill(paperFillBean);
			}
			fillNumber--;
		}
		
		shortAnswerNumber = this.shortAnswerNumber;
		//生成试卷简答题
		while (shortAnswerNumber != 0){
			n = random.nextInt(this.listQuestionBankShortAnswerBeans.size());
			questionBankShortAnswerBean = this.listQuestionBankShortAnswerBeans.get(n);
			this.listQuestionBankShortAnswerBeans.remove(n);
			
			paperShortAnswerBean.setPapername(this.paperName);
			paperShortAnswerBean.setQuestion(questionBankShortAnswerBean.getQuestion());
			paperShortAnswerBean.setModelanswer(questionBankShortAnswerBean.getAnswer());
			paperShortAnswerBean.setTeachername("0000");
			paperShortAnswerBean.setCourseid(this.courseid);
			paperShortAnswerBean.setStudentanswer("");
			paperShortAnswerBean.setScore(this.shortAnswerScore);
			
			for (int i = 0; i < listStudentBeanSize; i++) {
				studentBeanid = listStudentBean.get(i).getId();
				studentBeanSno = listStudentBean.get(i).getSno();
				paperShortAnswerBean.setStudentid(studentBeanid);
				/*if(studentBeanSno.equals("00000000000")){
					paperShortAnswerBean.setScore(this.shortAnswerScore);
				} else {
					paperShortAnswerBean.setScore(0);
				}*/
				this.paperShortAnswerService.addPaperShortAnswer(paperShortAnswerBean);
			}
			shortAnswerNumber--;
		}
		return SUCCESS;
	}
	
	//列出所有试卷
	public String listPaperName(){
		try {
			this.listPaperName = this.paperSelectService.searchPaper();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//查询学生考试试卷
	public String onlineExamination(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		this.listPaperSelectBean = this.paperSelectService.searchPaperSelect(this.studentid, this.paperName, 0);
		this.listPaperJudgeBean = this.paperJudgeService.searchPaperJudge(this.studentid, this.paperName, 0);
		this.listPaperFillBean = this.paperFillService.searchPaperFill(this.studentid, this.paperName, "");
		this.listPaperShortAnswerBean = this.paperShortAnswerService.searchShortAnswer(this.studentid, this.paperName, "");
		int listPaperSelectBeanSize = this.listPaperSelectBean.size();
		int listPaperJudgeBeanSize = this.listPaperJudgeBean.size();
		int listPaperFillBeanSize = this.listPaperFillBean.size();
		int listPaperShortAnswerBeanSize = this.listPaperShortAnswerBean.size();
		if(listPaperSelectBeanSize == 0 && listPaperJudgeBeanSize == 0 && listPaperFillBeanSize == 0 && listPaperShortAnswerBeanSize == 0){
			session.setAttribute("studentid", this.studentid);
			session.setAttribute("paperName", this.paperName);
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	//选择题考试
	public String examSelect(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		this.studentid = (Integer) session.getAttribute("studentid");
		this.paperName = (String) session.getAttribute("paperName");
		this.index = 0;
		this.listPaperSelectBean = this.paperSelectService.searchPaperSelect(this.studentid, this.paperName);
		this.listsize = this.listPaperSelectBean.size();
		
		return SUCCESS;
	}
	//选择题答题
	public String examingSelect(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		int temp;
		
		PaperSelectBean paperSelectBean = this.paperSelectService.findPaperSelectById(this.paperSelectBean.getId());
		paperSelectBean.setStudentanswer(this.paperSelectBean.getStudentanswer());
		if (paperSelectBean.getModelanswer() == paperSelectBean.getStudentanswer()){
			paperSelectBean.setGetscore(paperSelectBean.getScore());
		} else {
			paperSelectBean.setGetscore(0);
		}
		this.studentid = (Integer) session.getAttribute("studentid");
		this.paperName = (String) session.getAttribute("paperName");
		this.paperSelectService.updatePaperSelect(paperSelectBean);
		{
			temp = this.index;
			this.index = temp;
			temp = this.listsize;
			this.listsize = temp;
		}
		this.listPaperSelectBean = this.paperSelectService.searchPaperSelect(this.studentid, this.paperName);
		return SUCCESS;
	}
	//判断题考试
	public String examJudge(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		this.studentid = (Integer) session.getAttribute("studentid");
		this.paperName = (String) session.getAttribute("paperName");
		this.index = 0;	
		this.listPaperJudgeBean = this.paperJudgeService.searchPaperJudge(this.studentid, this.paperName);
		this.listsize = this.listPaperJudgeBean.size();
		
		return SUCCESS;
	}
	//判断题答题
	public String examingJudge(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		int temp;
		
		PaperJudgeBean paperJudgeBean = this.paperJudgeService.findPaperJudgeById(this.paperJudgeBean.getId());
		paperJudgeBean.setStudentanswer(this.paperJudgeBean.getStudentanswer());
		if (paperJudgeBean.getModelanswer() == paperJudgeBean.getStudentanswer()){
			paperJudgeBean.setGetscore(paperJudgeBean.getScore());
		} else {
			paperJudgeBean.setGetscore(0);
		}
		this.studentid = (Integer) session.getAttribute("studentid");
		this.paperName = (String) session.getAttribute("paperName");
		this.paperJudgeService.updatePaperJudge(paperJudgeBean);
		{
			temp = this.index;
			this.index = temp;
			temp = this.listsize;
			this.listsize = temp;
		}
		this.listPaperJudgeBean = this.paperJudgeService.searchPaperJudge(this.studentid, this.paperName);
		return SUCCESS;
	}
	//填空题考试
	public String examFill(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		this.studentid = (Integer) session.getAttribute("studentid");
		this.paperName = (String) session.getAttribute("paperName");
		this.index = 0;	
		this.listPaperFillBean = this.paperFillService.searchPaperFill(this.studentid, this.paperName);
		this.listsize = this.listPaperFillBean.size();
		
		return SUCCESS;
	}
	//填空题答题
	public String examingFill(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		int temp;
		
		PaperFillBean paperFillBean = this.paperFillService.findPaperFillById(this.paperFillBean.getId());
		paperFillBean.setStudentanswer(this.paperFillBean.getStudentanswer());
		
		this.studentid = (Integer) session.getAttribute("studentid");
		this.paperName = (String) session.getAttribute("paperName");
		this.paperFillService.updatePaperFill(paperFillBean);
		{
			temp = this.index;
			this.index = temp;
			temp = this.listsize;
			this.listsize = temp;
		}
		this.listPaperFillBean = this.paperFillService.searchPaperFill(this.studentid, this.paperName);
		return SUCCESS;
	}
	//简答题考试
	public String examShortAnswer(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		this.studentid = (Integer) session.getAttribute("studentid");
		this.paperName = (String) session.getAttribute("paperName");
		this.index = 0;	
		this.listPaperShortAnswerBean = this.paperShortAnswerService.searchShortAnswer(this.studentid, this.paperName);
		this.listsize = this.listPaperShortAnswerBean.size();
		
		return SUCCESS;
	}
	//简答题答题
	public String examingShortAnswer(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		int temp;
		
		PaperShortAnswerBean paperShortAnswerBean = this.paperShortAnswerService.findPaperShortAnswerById(this.paperShortAnswerBean.getId());
		paperShortAnswerBean.setStudentanswer(this.paperShortAnswerBean.getStudentanswer());
		
		this.studentid = (Integer) session.getAttribute("studentid");
		this.paperName = (String) session.getAttribute("paperName");
		this.paperShortAnswerService.updatePaperShortAnswer(paperShortAnswerBean);
		{
			temp = this.index;
			this.index = temp;
			temp = this.listsize;
			this.listsize = temp;
		}
		this.listPaperShortAnswerBean = this.paperShortAnswerService.searchShortAnswer(this.studentid, this.paperName);
		return SUCCESS;
	}
	
	//成绩查询列出课程
	@SuppressWarnings("unused")
	public String findGradeCourse(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		List<CourseBean> listCourseBean = new ArrayList<CourseBean>();
		this.listCourseBean.removeAll(this.listCourseBean);
		this.listGradeBean.removeAll(this.listGradeBean);
		
		this.listCourseBean = this.courseService.findAllCourse();
		this.studentBean = (StudentBean) session.getAttribute("user");
		this.listcourseid = this.paperSelectService.searchCourseid(this.studentBean.getId());
		this.listPaperName = this.paperSelectService.searchPaper();
		int listcourseidsize = this.listcourseid.size();
		int listPaperNamesize = this.listPaperName.size();
		int listCourseBeansizi = this.listCourseBean.size();
		
		for ( int i = 0; i < listcourseidsize; i ++){
			for ( int j = 0 ; j < listPaperNamesize; j ++){
				GradeBean gradeBean = new GradeBean();
				List<PaperSelectBean> selectBeans = new ArrayList<PaperSelectBean>();
				List<PaperJudgeBean> judgeBeans = new ArrayList<PaperJudgeBean>();
				List<PaperFillBean> fillBeans = new ArrayList<PaperFillBean>();
				List<PaperShortAnswerBean> shortAnswerBeans = new ArrayList<PaperShortAnswerBean>();
				
				
				selectBeans = this.paperSelectService.searchPaperSelect(this.studentBean.getId(), this.listcourseid.get(i).intValue(), this.listPaperName.get(j));
				judgeBeans = this.paperJudgeService.searchPaperJudge(this.studentBean.getId(), this.listcourseid.get(i).intValue(), this.listPaperName.get(j));
				fillBeans = this.paperFillService.searchPaperFill(this.studentBean.getId(), this.listcourseid.get(i).intValue(), this.listPaperName.get(j));
				shortAnswerBeans = this.paperShortAnswerService.searchShortAnswer(this.studentBean.getId(), this.listcourseid.get(i).intValue(), this.listPaperName.get(j));
				
				int n = 0;
				int selectBeanslength = selectBeans.size();
				int judgeBeanslength = judgeBeans.size();
				int fillBeanslength = fillBeans.size();
				int shortAnswerBeanslength = shortAnswerBeans.size();
				
				for (int k = 0; k < selectBeanslength; k ++){
					n = n + selectBeans.get(k).getGetscore();
				}
				for (int k = 0; k < judgeBeanslength; k ++){
					n = n + judgeBeans.get(k).getGetscore();
				}
				for (int k = 0; k < fillBeanslength; k ++){
					n = n + fillBeans.get(k).getGetscore();
				}
				for (int k = 0; k < shortAnswerBeanslength; k ++){
					n = n + shortAnswerBeans.get(k).getGetscore();
				}
				
				for(int k = 0; k < listCourseBeansizi; k ++){
					if (selectBeans.get(0).getCourseid() == this.listCourseBean.get(k).getId())
					gradeBean.setCourseName(this.listCourseBean.get(k).getName());
				}
				gradeBean.setPaperName(selectBeans.get(0).getPapername());
				
				gradeBean.setGrade(n);
				
				this.listGradeBean.add(gradeBean);
				
			}
			
		}
		return SUCCESS;
	}
	//阅卷列出试卷名称、题目类型
	public String listPaperQuetionType(){
		try {
			this.listPaperName = this.paperSelectService.searchPaper();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//开始阅卷
	public String forwardType(){
		if (this.QuestionType.equals("Fill")){
			this.listPaperFillBean = this.paperFillService.searchPaperFill(this.paperName);
			this.index = 0;
			this.listsize = this.listPaperFillBean.size();
			session.setAttribute("listPaperFillBean", this.listPaperFillBean);
			return "FillType";
		}
		if (this.QuestionType.equals("ShortAnswer")){
			this.listPaperShortAnswerBean = this.paperShortAnswerService.searchShortAnswer(this.paperName);
			this.index = 0;
			this.listsize = this.listPaperShortAnswerBean.size();
			session.setAttribute("listPaperShortAnswerBean", this.listPaperShortAnswerBean);
			return "ShortAnswerType";
		}
		return ERROR;
	}
	//填空题阅卷
	@SuppressWarnings("unchecked")
	public String updateFillBean(){
		int temp = 0;
		this.listPaperFillBean = (List<PaperFillBean>)session.getAttribute("listPaperFillBean");
		PaperFillBean paperFillBean = new PaperFillBean();
		paperFillBean = this.paperFillService.findPaperFillById(this.paperFillBean.getId());
		paperFillBean.setGetscore(this.paperFillBean.getGetscore());
		this.paperFillService.updatePaperFill(paperFillBean);
		temp = this.index;
		this.index = temp;
		temp = this.listsize;
		this.listsize = temp;
		return SUCCESS;
	}
	//简答题阅卷
	@SuppressWarnings("unchecked")
	public String updateShortAnswerBean(){
		int temp = 0;
		this.listPaperShortAnswerBean = (List<PaperShortAnswerBean>)session.getAttribute("listPaperShortAnswerBean");
		PaperShortAnswerBean paperShortAnswerBean = new PaperShortAnswerBean();
		paperShortAnswerBean = this.paperShortAnswerService.findPaperShortAnswerById(this.paperShortAnswerBean.getId());
		paperShortAnswerBean.setGetscore(this.paperShortAnswerBean.getGetscore());
		this.paperShortAnswerService.updatePaperShortAnswer(paperShortAnswerBean);
		temp = this.index;
		this.index = temp;
		temp = this.listsize;
		this.listsize = temp;
		return SUCCESS;
	}
}
