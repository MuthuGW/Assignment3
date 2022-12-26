package org.student;

public class Student
{
	public void getStudentInfo(int id)
	{
		System.out.println("Student id is:"+id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student id is:"+id +'\n'+"Student name:"+name);
	}
	public void getStudentInfo(String email,long phonenum)
	{
		System.out.println("Student email is:"+email +'\n'+"Student phonenum is:"+phonenum);
	}

	public static void main(String[] args)
	{
		Student obj =new Student();
		obj.getStudentInfo(100);
		obj.getStudentInfo(100, "muthu");
		obj.getStudentInfo("muthu20@gmail.com", 9876543210l);

	}
}
