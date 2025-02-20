package examples;

class Customer 
{
	int amount = 10000;
	synchronized void withdraw(int amount)
	{
		if(this.amount < amount)
		{
			System.out.println("Insufficient Fund");
			try {
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Error generated");
			}
			finally {
				this.amount -= amount;
				System.out.println("Withdrawl completed");
				System.out.println("Balance : " + this.amount);
			}
		}
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Current Amount : " + this.amount);
		this.amount += amount;
		System.out.println("Deposit completed");
		System.out.println("Balance : " + this.amount);
		notify();
	}
}
public class Ex10 {
	public static void main(String[] args)
	{
		final Customer c = new Customer();
		new Thread()  // anonymous Thread
		{
			public void run()
			{
				c.withdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.deposit(10000);
			}
		}.start();
	}
}
