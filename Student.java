package com.sunbeam;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private double marks;
	
	public Student(int rollNo,String name,double marks)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		return Double.compare(o.marks, this.marks);
	}
	
	
	
}
