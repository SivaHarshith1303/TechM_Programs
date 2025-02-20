package examples;

class Printer
{
	public void print(int n)
	{
		System.out.println(n + " Table is Printing : ");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + " * " + i + " = " + n*i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Thread10 implements Runnable
{
	Printer p1;
	public Thread10(Printer p)
	{
		this.p1 = p;
	}
	public void run()
	{
		p1.print(19);
	}
}
class Thread11 implements Runnable
{
	Printer p2;
	public Thread11(Printer p)
	{
		this.p2 = p;
	}
	public void run()
	{
		p2.print(12);
	}
}
public class Ex8 {
	public static void main(String[] args)
	{
		// How a single resource is shared between multiple Threads 
		Printer p = new Printer();
		Runnable obj1 = new Thread10(p);
		Runnable obj2 = new Thread11(p);
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}
