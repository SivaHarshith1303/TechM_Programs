package arrayList_Assignments_Feb04;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task14 {
	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);ll.add(5);
		ll.add(2);ll.add(6);
		ll.add(3);ll.add(7);
		ll.add(4);ll.add(8);
		
		ListIterator ltr = ll.listIterator();
		System.out.print("Iterating from start : ");
		while(ltr.hasNext())
			System.out.print(ltr.next() + " ");
		System.out.println();
		System.out.print("Iterating from end : ");
		while(ltr.hasPrevious())
			System.out.print(ltr.previous() + " ");
	}
}
