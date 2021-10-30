package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String names;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String>courses;
	private Properties prop;
	public String getNames() {
		return names;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp(String names, List<String> phones, Set<String> addresses, Map<String, String> courses, Properties prop) {
		super();
		this.names = names;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.prop = prop;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [names=" + names + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ ", prop=" + prop + "]";
	}
	
	
	
}
