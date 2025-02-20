package examples;

class Thread6 extends Thread 
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println(getName());
	}
}
class Thread7 extends Thread 
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println(getName());
	}
}
public class Ex5 {
	public static void main(String[] args)
	{
		Thread6 t6 = new Thread6();
		Thread7 t7 = new Thread7();
		t6.start();
		t7.start();
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName());
	}
}
