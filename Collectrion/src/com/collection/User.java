package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {

	private Integer eid;
	
	private String ename;
	
	
	public User(Integer eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}


	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "User [eid=" + eid + ", ename=" + ename + "]";
	}


	public static void main(String[] args) {
	
		List<User> users=new ArrayList();
		
		users.add(new User(1, "rohit"));
		users.add(new User(1, "rohit"));
		
//		for(User user:users) {
//			System.out.println(user);
//		}
		
		for(User user:users) {
			System.out.println(user);
		}
		
		//users.forEach(System.out::println);
		
//		Collections.synchronizedList(users);
//		Collections.synchronizedCollection(users);
		
	}
}
