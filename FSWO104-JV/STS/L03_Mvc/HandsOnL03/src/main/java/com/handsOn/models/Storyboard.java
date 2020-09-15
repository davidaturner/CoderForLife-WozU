package com.handsOn.models;

public class Storyboard {

	protected String beginning;
	protected String middle;
	protected String ending;
	
	public static final String BEGIN_STR = "I was watching TV with Mark, when suddenly ...";
	public static final String MID_STR = "... a breaking news alert showed a llama running on the freeway ...";
	public static final String END_STR = "... and even though we saw that 3 years ago, we still laugh to this day ...";
	
	public String getBeginning() {
		return beginning;
	}
	public void setBeginning(String beginning) {
		this.beginning = beginning;
	}
	public String getMiddle() {
		return middle;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public String getEnding() {
		return ending;
	}
	public void setEnding(String ending) {
		this.ending = ending;
	}
}
