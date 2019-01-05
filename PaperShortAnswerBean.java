package com.online_examination_system.bean;

public class PaperShortAnswerBean {
	private int id;
	private String papername;
	private String question;
	private String modelanswer;
	private String teachername;
	private int studentid;
	private int courseid;
	private String studentanswer;
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
	public String getModelanswer() {
		return modelanswer;
	}
	public void setModelanswer(String modelanswer) {
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
	public String getStudentanswer() {
		return studentanswer;
	}
	public void setStudentanswer(String studentanswer) {
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
