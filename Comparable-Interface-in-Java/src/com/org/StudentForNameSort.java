package com.org;

public class StudentForNameSort implements Comparable<StudentForNameSort>{

	private String name;
	private int roll;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public int compareTo(StudentForNameSort arg0) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(arg0.getName());
	}

}
