package genericsAssignment_Feb04;
import java.util.ArrayList;
public class GenericTask2 <T extends Number>{
	private ArrayList<T> obj;
	
	private int evensum = 0;
	private int oddsum = 0;
	public GenericTask2(ArrayList<T> obj)
	{
		this.obj = obj;
	}
	
	public void calculate()
	{
		for(T i : obj)
		{
			if(i.intValue()%2 == 0) 
				evensum += i.intValue();
			else 
				oddsum += i.intValue();
		}
	}
	
	public int evenSum()
	{
		return evensum;
	}
	public int oddSum()
	{
		return oddsum;
	}
}
