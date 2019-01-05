package com.online_examination_system.bean;

public class PaperSelectBean {
	private int id;
	private String papername;
	private String question;
	private int modelanswer;
	private String teachername;
	private int studentid;
	private int courseid;
	private int studentanswer;
	private int score;
	private int getscore;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPapername() {
		return papername;
	}
	public void setPapername(String papername) {
		this.papername = papername;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getModelanswer() {
		return modelanswer;
	}
	public void setModelanswer(int modelanswer) {
		this.modelanswer = modelanswer;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public int getStudentanswer() {
		return studentanswer;
	}
	public void setStudentanswer(int studentanswer) {
		this.studentanswer = studentanswer;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getGetscore() {
		return getscore;
	}
	public void setGetscore(int getscore) {
		this.getscore = getscore;
	}
	
}
