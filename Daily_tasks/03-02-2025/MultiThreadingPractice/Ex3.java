package examples;

class Thread5 extends Thread 
{
	@SuppressWarnings("deprecation")
	public void run()
	{
		System.out.println("Thread name : " + currentThread().getName());
		System.out.println("Thread id : " + currentThread().getId());
		System.out.println("Thread priority : " + currentThread().getPriority());
	}
}
public class Ex3 {
	public static void main(String[] args)
	{
		Thread5 t5 = new Thread5();
		Thread5 t6 = new Thread5();
		Thread5 t7 = new Thread5();
		t6.setPriority(10);
		t7.setPriority(5);
		t5.setPriority(1);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		t5.setName("Thread5");
		t6.setName("Thread6");
		t7.setName("Thread7");
		t6.start();
		t7.start();
		t5.start();
	}
}
