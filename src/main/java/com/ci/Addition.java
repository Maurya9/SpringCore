package com.ci;

public class Addition {
	private int a;
	private int b;
	
	
	public Addition(double a, double b) {
		System.out.println("this is a double double");
		this.a =(int) a;
		this.b = (int)b;
	}
	public Addition(int a, int b) {
		System.out.println("this is int int");
			this.a = a;
			this.b = b;
		}

	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	
	void sum() {
		System.out.println("sum is"+(this.a+this.b));
	}
	
	

}
