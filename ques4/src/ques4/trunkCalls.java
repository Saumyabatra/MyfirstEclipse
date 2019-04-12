package ques4;

public class trunkCalls {
	int hrs=1;
}
class ordinary extends trunkCalls{
	void CalculateCharges(int hrs)
	{
		int charges=hrs*10;
		System.out.println("THE CALL IS A TRUNK CALL AND CHARGES ARE:"+charges);
	}
}
class Urgent extends trunkCalls{
	void CalculateCharges(int hrs)
	{
		int charges=hrs*100;
		System.out.println("THE CALL IS A URGENT CALL AND CHARGES ARE:"+charges);
	}
}
class lightning extends trunkCalls{
	void CalculateCharges(int hrs)
	{
		int charges=hrs*1000;
		System.out.println("THE CALL IS A LIGHTNING CALL AND CHARGES ARE:"+charges);
	}
}
