package com.nt.sbeans;

public class UserService {
	private String name;
	private  int id;
	
	public UserService(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		id = id;
	}
	
	@Override
	public String toString() {
		return "UserService [name=" + name + ", Id=" + id + "]";
	}
	
	
	
	 
}

	
	


