package com.SpringCore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddresses;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddresses() {
		return studentAddresses;
	}
	public void setStudentAddresses(String studentAddresses) {
		this.studentAddresses = studentAddresses;
	}
	public Student(int studentId, String studentName, String studentAddresses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddresses = studentAddresses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddresses="
				+ studentAddresses + "]";
	}
	

}
