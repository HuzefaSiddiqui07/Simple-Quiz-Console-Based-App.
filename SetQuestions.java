package com.corejava.quizapplication;

public class SetQuestions {
	
	// Declare 
	
	private String question;
	
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	
	// Create Parameterized Constructor
	
	public SetQuestions(String question, String option1, String option2, String option3, String option4) {
		super();
		this.question = question;
		Option1 = option1;
		Option2 = option2;
		Option3 = option3;
		Option4 = option4;
	}
	
	// Getter & Setter Use

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return Option1;
	}

	public void setOption1(String option1) {
		Option1 = option1;
	}

	public String getOption2() {
		return Option2;
	}

	public void setOption2(String option2) {
		Option2 = option2;
	}

	public String getOption3() {
		return Option3;
	}

	public void setOption3(String option3) {
		Option3 = option3;
	}

	public String getOption4() {
		return Option4;
	}

	public void setOption4(String option4) {
		Option4 = option4;
	}
	
	// Use toString Method

	@Override
	public String toString() {
		return "SetQuestions [question=" + question + ", Option1=" + Option1 + ", Option2=" + Option2 + ", Option3="
				+ Option3 + ", Option4=" + Option4 + "]";
	}
	
}
