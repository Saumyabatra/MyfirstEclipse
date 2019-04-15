//Creation of thread using Thread class
package multithreading;
public class method1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hello from method1 where i="+i);
		}
	}
	public static void main(String[] args) {
			method1 t1=new method1();
			t1.start();
			method1 t2=new method1();
			t2.start();
		
	}

}
