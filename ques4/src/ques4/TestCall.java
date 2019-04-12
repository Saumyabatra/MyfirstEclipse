package ques4;

class TestCall {
	public static void main(String args[])
	{
		ordinary obj=new ordinary();
		obj.CalculateCharges(5);
		Urgent obj1=new Urgent();
		obj1.CalculateCharges(10);
		lightning obj2=new lightning();
		obj2.CalculateCharges(6);
	}
}
