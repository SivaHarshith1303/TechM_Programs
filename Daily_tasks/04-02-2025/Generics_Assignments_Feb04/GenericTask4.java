package genericsAssignment_Feb04;

import java.util.ArrayList;
public class GenericTask4 <T> {
	private ArrayList<T> obj;
	
	public GenericTask4(ArrayList<T> obj)
	{
		this.obj = obj;
	}
	
	public ArrayList<T> reverse()
	{
		int i = 0,j = obj.size()-1;
		while(i < j)
		{
			T temp = obj.get(i);
			obj.set(i, obj.get(j));
			obj.set(j, temp);
			i++;
			j--;
		}
		return obj;
	}
}
