package org.student;

public class AxisBank extends  BankInfo  {
	public void deposit()
	{
		System.out.println("the deposit amount is:40000");
	}

	public static void main(String[] args)
	{
		AxisBank obj =new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
		

	}

}
