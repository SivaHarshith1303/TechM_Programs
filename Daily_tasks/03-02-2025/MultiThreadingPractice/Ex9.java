package examples;

class TablesPrinter 
{
	public synchronized void print(int n)
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
class Thread12 implements Runnable 
{
	TablesPrinter tb;
	public Thread12(TablesPrinter tb)
	{
		this.tb = tb;
	}
	public void run()
	{
		tb.print(10);
	}
}
class Thread13 implements Runnable 
{
	TablesPrinter tb;
	public Thread13(TablesPrinter tb)
	{
		this.tb = tb;
	}
	public void run()
	{
		tb.print(12);
	}
}
public class Ex9 {
	public static void main(String[] args)
	{
		TablesPrinter tb = new TablesPrinter();
		Runnable obj1 = new Thread12(tb);
		Runnable obj2 = new Thread13(tb);
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
	}
}
