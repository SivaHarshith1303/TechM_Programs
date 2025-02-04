package genericsAssignment_Feb04;

import java.util.ArrayList;
public class GenericTask3<list,target_value> {
	private ArrayList<list> arr;
	private target_value target;
	
	public GenericTask3(ArrayList<list> obj1,target_value obj2)
	{
		this.arr = obj1;
		this.target = obj2;
	}
	
	public int findIdx()
	{
		int length = arr.size();
		for(int i=0;i<length;i++)
		{
			if(arr.get(i).equals(target))
				return i;
		}
		return -1;
	}
}
