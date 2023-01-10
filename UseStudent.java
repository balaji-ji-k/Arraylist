package com.onesoft.collections;

import java.util.ArrayList;
public class UseStudent {
	public static void main(String[] args) {
	Student student1 =new Student("Hari",101,"Male",87);
	Student student2 = new Student("Raju",112, "Male",75);
	Student student3 = new Student("Harini",105,"Female",80);
	Student student4 = new Student("Rajesh",109,"Male",60);
	Student student5 = new Student("Kavitha",107,"Female",90);
	Student student6 = new Student("Abinaya",100,"Female",65);
	
	ArrayList<Student> students = new ArrayList<>();
	students.add(student1);
	students.add(student2);
	students.add(student3);
	students.add(student4);
	students.add(student5);
	students.add(student6);
	/*for(int i=0;i<students.size();i++)
	{
		if(students.get(i).getGender().equals("Male"))
		{
			System.out.println(students.get(i));
		}
	}*/
	ArrayList<Student> maleStudentList=new ArrayList<>();
	for(int i=0;i<students.size();i++)
	{
		if(students.get(i).getGender().equals("Male"))
		{
			maleStudentList.add(students.get(i));
		}
	}
	Student max = student1;
	/*for(Student x : students)
	{
		if(x.getMark()>max.getMark())
		{
			max=x;
		}
	}*/
	//System.out.println(max);
	for(Student x: maleStudentList)
	{
		if(x.getMark()>max.getMark())
		{
			max=x;
		}
	}
	System.out.println(max.getName());
	
}
}
