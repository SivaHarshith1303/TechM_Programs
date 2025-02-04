package genericsAssignment_Feb04;
import java.util.ArrayList;
public class Task5 {
	public static void main(String[] args)
	{
		ArrayList arr1 = new ArrayList<>();
		arr1.add(1);arr1.add(2);arr1.add(3);arr1.add(4);arr1.add(5);
		
		ArrayList arr2 = new ArrayList<>();
		arr2.add("Siva");arr2.add("naidu");arr2.add("Harshith");arr2.add(4);arr2.add(5);
		
		GenericTask5<Object,Object> obj = new GenericTask5<Object,Object>(arr1,arr2);
		
		ArrayList ans = obj.mergeList();
		System.out.println(ans);
	}
}
