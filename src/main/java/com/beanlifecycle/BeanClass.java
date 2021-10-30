package com.beanlifecycle;

public class BeanClass {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("setter method");
		this.price = price;
	}

	public BeanClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BeanClass [price=" + price + "]";
	}
	 
	public void init() {
		System.out.println("this is init method");
	}
	
	public void destroy() {
		System.out.println("this is destroy method");
	}

}
