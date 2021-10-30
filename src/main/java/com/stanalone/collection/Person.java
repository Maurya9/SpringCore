package com.stanalone.collection;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String, Integer> fess;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	

	public Map<String, Integer> getFess() {
		return fess;
	}

	public void setFess(Map<String, Integer> fess) {
		this.fess = fess;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fess=" + fess + "]";
	}

	
	

}
