package genericsAssignment_Feb04;
import java.util.ArrayList;
public class GenericTask5<T,V> {
	private ArrayList<T> arr1;
	private ArrayList<V> arr2;
	
	public GenericTask5(ArrayList<T> arr1,ArrayList<V> arr2)
	{
		this.arr1 = arr1;
		this.arr2 = arr2;
	}
	
	public ArrayList<Object> mergeList()
	{
		ArrayList<Object> ans = new ArrayList<>();
		int i = 0,j = 0;
		while(i < arr1.size() && j < arr2.size())
		{
			ans.add(arr1.get(i));
			ans.add(arr2.get(j));
			i++;
			j++;
		}
		while(i < arr1.size())
			ans.add(arr1.get(i++));
		while(j < arr2.size())
			ans.add(arr2.get(j++));
		return ans;
	}
}
