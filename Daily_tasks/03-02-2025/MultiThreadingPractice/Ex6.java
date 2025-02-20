package examples;

class Thread8 implements Runnable 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.err.println("Error generated");
			}
		}
	}
}
class Thread9 implements Runnable 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Ex6 {
	public static void main(String[] args)
	{
		Runnable obj1 = new Thread8();
		Runnable obj2 = new Thread9();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.setName("Thread - A");
		t2.setName("Thread - B");
		t1.start();
		t2.start();
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName());
	}
}
