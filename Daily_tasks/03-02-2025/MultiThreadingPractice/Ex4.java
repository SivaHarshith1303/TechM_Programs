package examples;

public class Ex4 {
	static class MyThread extends Thread
	{
		public void run()
		{
			for(int i=0;i<5;i++)
				System.out.println("MyThread");
		}
	}
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		t1.start();
		for(int i=0;i<5;i++)
			System.out.println("Main Thread");
	}
}
