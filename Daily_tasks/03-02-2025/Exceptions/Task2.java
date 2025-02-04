package exceptionTasks_Feb03;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args)
	{
		int[] arr = {5,6,7};
		for(int i : arr)
		{
			try {
				checkNumber(i);
			}
			catch(Throwable e)
			{
				System.err.println("There is an exception occured");
				System.out.println(e.getMessage());
			}
		}
	}
	public static void checkNumber(int n) throws Exception 
	{
		if(n%2 == 1)
			throw new Exception("This is an odd number");
	}
}
