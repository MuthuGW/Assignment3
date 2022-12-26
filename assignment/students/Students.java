package org.students;

import org.department.Department;

public class Students extends Department
{
public void studentName()
{
 System.out.println("Name=muthu");
}
public void studentDept()
{
System.out.println(" course = Bsc cs");
}
public void studentid()
{
	System.out.println(" id=100");
}
public static void main(String[] args) {
	Students obj = new Students();
	obj.collegeName();
	obj.collegeCode();
	obj.collegeRank();
	obj.departmetName();
	obj.studentName();
	obj.studentDept();
	obj.studentid();
	
}
}
