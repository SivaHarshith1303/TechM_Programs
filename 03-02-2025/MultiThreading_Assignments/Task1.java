package multiThreading_TasksFeb03;

public class Task1 extends Thread {
	
	@Override 
	public void run()
	{
		System.out.println("Hello,Java!");
	}
	public static void main(String[] args)
	{
		Task1 t1 = new Task1();
		
		t1.start();
	}
}
