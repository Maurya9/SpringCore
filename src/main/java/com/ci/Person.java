package com.ci;

public class Person {
	private int personId;
	private String name;
	private Certi Certi;
	public Person(int personId, String name,Certi certi) {
	
		this.personId = personId;
		this.name = name;
		this.Certi=certi;
		
	}
	@Override
	public String toString() {
		return this.personId+" : "+this.name+"{"+this.Certi.Name+"}";
	}
	
	

}
