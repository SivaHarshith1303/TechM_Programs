package examples;

public class Ex7 {
	public static void main(String[] args)
	{
		// join is used to complete the execution of a single thread 
		Runnable obj1 = new Thread8();
		Runnable obj2 = new Thread9();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e)
		{
			System.err.println("This is an error");
			e.printStackTrace();
		}
		
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName());
	}
}
