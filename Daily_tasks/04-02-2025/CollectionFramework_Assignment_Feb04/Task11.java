package arrayList_Assignments_Feb04;
import java.util.LinkedList;
public class Task11 {
	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		System.out.println(ll);
		
		// To add an element at the last 
		int idx = ll.size();
		ll.add(idx,10);
		System.out.println(ll);
	}
}
