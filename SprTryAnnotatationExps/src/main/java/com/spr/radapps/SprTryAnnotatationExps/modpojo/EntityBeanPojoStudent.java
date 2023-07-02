package com.spr.radapps.SprTryAnnotatationExps.modpojo;

public class EntityBeanPojoStudent {
	
	private int stuRoll;
	private String stuName;
	private double marks;
	
	public EntityBeanPojoStudent(int stuRoll, String stuName, double marks) {
		super();
		this.stuRoll = stuRoll;
		this.stuName = stuName;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "EntityBeanPojoStudent [stuRoll=" + stuRoll + ", stuName=" + stuName + ", marks=" + marks + "]";
	}

	public int getStuRoll() {
		return stuRoll;
	}
	public String getStuName() {
		return stuName;
	}
	public double getMarks() {
		return marks;
	}
	public void setStuRoll(int stuRoll) {
		this.stuRoll = stuRoll;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	

}