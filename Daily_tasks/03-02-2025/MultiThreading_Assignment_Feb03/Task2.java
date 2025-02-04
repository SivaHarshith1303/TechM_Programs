package multiThreading_TasksFeb03;

public class Task2 {
	public static void main(String[] args)
	{
		Thread evenThread = new Thread(new EvenNumbers());
        Thread oddThread = new Thread(new OddNumbers());
        
        evenThread.start();
        oddThread.start();
	}
}
class EvenNumbers implements Runnable {
    @Override
    public void run() {
        
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class OddNumbers implements Runnable {
    @Override
    public void run() {
    	
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
