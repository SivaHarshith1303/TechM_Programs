package arrayList_Assignments_Feb04;
import java.util.LinkedList;
public class Task15 {
	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);ll.add(5);
		ll.add(2);ll.add(6);
		ll.add(3);ll.add(7);
		ll.add(4);ll.add(8);
		
		System.out.println(ll);
		
		// Inserting an element at specified position 
		
		int idx = 3,element = 100;
		ll.add(idx,element);
		System.out.println(ll);
	}
}
