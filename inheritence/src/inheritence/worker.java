package inheritence;
//ques 3
public class worker {
	String name="ABC";
	int sal_rate=100;
}
class DailyWorker extends worker
{
	public void ComPay(int hrs)
	{
		int salary;
		salary=hrs*sal_rate;
		System.out.println("The salary of the worker is:"+ salary);
	}
}
class SalariedWorker extends worker
{
	public void ComPay(int hrs)
	{
		int salary;
		salary=40+hrs*sal_rate;
		System.out.println("The salary of the worker is:"+ salary);
	}
}
class test{
	public static void main(String args[])
	{
		DailyWorker obj=new DailyWorker();
		System.out.println("The name of worker is :"+obj.name);
		obj.ComPay(5);
		SalariedWorker obj1=new SalariedWorker();
		System.out.println("The name of worker is :"+obj1.name);
		obj1.ComPay(5);
	}
}

