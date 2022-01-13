package com.bankui.beans;

import org.springframework.stereotype.Component;

@Component
public class Help {
	
	private String Question;
	private String Answer;
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	@Override
	public String toString() {
		return "Help [Question=" + Question + ", Answer=" + Answer + "]";
	}
	
}
