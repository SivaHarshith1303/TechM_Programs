package exceptionTasks_Feb03;

public class Task1 {
	public static void main(String[] args)
	{
		try 
		{
			int[] arr = {1,2,3,4,5};
			int num = arr[5];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("The code is accessing the index which is out of bound");
			// e.printStackTrace();
		}
		finally
		{
			System.out.println("Please check the index which you are accessing in the try block");
		}
	}
}
