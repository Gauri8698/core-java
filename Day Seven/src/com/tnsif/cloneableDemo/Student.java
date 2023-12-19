package com.tnsif.cloneableDemo;

public class Student implements Cloneable {
	
	private String name;
	private int ID;
	private String branch;
	
	//default Constructor
	public Student() {
		super();
	}

//parameterize constructor
	public Student(String name, int iD, String branch) {
		super();
		this.name = name;
		ID = iD;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + ", branch=" + branch + "]";
	}

	
	public Object clone() throws CloneNotSupportedException

	{
		return super.clone(); 

}
	}
