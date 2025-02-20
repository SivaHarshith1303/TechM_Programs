package examples;


class Thread1 extends Thread 
{
	public void run()
	{
		System.out.println("You are running Thread 1");
	}
}
class Thread2 extends Thread 
{
	public void run()
	{
		System.out.println("You are running Thread 2");
	}
}
public class Ex1 {
	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t2.start();
		t1.start();
		Thread t3 = new Thread1();
		t3.start();
	}
}
