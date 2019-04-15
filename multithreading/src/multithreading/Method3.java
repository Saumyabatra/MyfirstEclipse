package multithreading;
//Creating a thread using anonymous inner class
public class Method3 {

	public static void main(String[] args) {
		Thread t1=new Thread()
		{
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println("hello from method1 where i="+i);
				}
			}
		};
		t1.start();
		
	}

}
