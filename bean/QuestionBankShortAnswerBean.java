package com.online_examination_system.bean;

public class QuestionBankShortAnswerBean {
	private int id;
	private String question;
	private String answer;
	private String tearchername;
	private int courseid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getTearchername() {
		return tearchername;
	}
	public void setTearchername(String tearchername) {
		this.tearchername = tearchername;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	
}
