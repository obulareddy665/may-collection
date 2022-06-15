package com.collection.linkedlist;

/**
 * @author obula
 *
 */
public class Employee {
	
	private Integer eid;
	
	private String ename;

	
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

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	

	

}
