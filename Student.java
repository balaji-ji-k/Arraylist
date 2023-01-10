package com.onesoft.collections;

public class Student {
	
	private String name;
	private int id;
	private String gender;
	private int mark;
	public Student(String name, int id, String gender,int mark)
	{
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.mark =mark;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public void setMark(int mark)
	{
		this.mark=mark;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getId()
	{
		return this.id;
	}
	public String getGender()
	{
		return this.gender;
	}
	public int getMark()
	{
		return this.mark;
	}
	
	public String toString()
	{
		return "Name = "+name+" ID = "+id+" Gender = "+gender+" Mark = "+mark;
	}

}
