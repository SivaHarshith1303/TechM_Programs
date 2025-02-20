package examples;


class Thread3 extends Thread implements Runnable 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread1");
//			try {
//				Thread.sleep(1000);
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//				System.err.println("This is an error");
//			}
		}
	}
}
class Thread4 extends Thread implements Runnable 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread2");
			
//			try {
//				Thread.sleep(1000);
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//				System.err.println("This is an error");
//			}
		}
	}
}
public class Ex2 {
	public static void main(String[] args)
	{
		Runnable obj1 = new Thread3();
		Runnable obj2 = new Thread4();
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		Thread t5 = new Thread(obj1);
		Thread t6 = new Thread(obj2);
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}
