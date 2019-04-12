package ques5;

public class employee {
	String name="SAUMYA";
	int empid=1;
	int salary=300000;
	public employee()
	{
		name="SHAURYA";
		empid=2;
		salary=300000;
	}
	void set_details(String name,int empid,int salary)
	{
	name=this.name;
	empid=this.empid;
	salary=this.salary;
	}
	void get_details()
	{
		System.out.println("NAME IS:"+name);
		System.out.println("EMPID IS:"+empid);
		System.out.println("SALARY IS:"+salary);
	}
	void increase_salary(int bonus)
	{
		int newSalary;
		newSalary=salary+((bonus%100)*salary);
		System.out.println("SALARY INCREASED BY BONUS OF:"+newSalary);
	}
}
class Manager extends employee{
	int dept=10;
	void get_dept()
	{
		System.out.println("The Department is:"+ dept);
	}
}
