package com.beanlifecycle;

public class Example {
	private String Subject;

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		System.out.println("set proprerty");
		Subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [Subject=" + Subject + "]";
	}
	
	public void start() {
		System.out.println("starting with init");
	}
	
	public void end() {
		System.out.println("ending with destroy");
	}

}
