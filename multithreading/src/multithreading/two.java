package multithreading;

class even extends Thread
{
public static void main(String args[])
{
Thread t1=new Thread()
{
public void run()
{
for(int i=0;i<30;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
};
Thread t2=new Thread()
{
public void run()
{
for(int i=0;i<30;i++)
{
if(i%2!=0)
{
System.out.println(i);
}
}
}
};
t1.start();
t2.start();
try
{
t1.join();}
catch (InterruptedException e)
{
e.printStackTrace();
}
try
{
t2.join();}
catch (InterruptedException e2)
{
e2.printStackTrace();
}
}
}
