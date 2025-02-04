package arrayList_Assignments_Feb04;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
public class Task12 {
	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);ll.add(5);
		ll.add(2);ll.add(6);
		ll.add(3);ll.add(7);
		ll.add(4);ll.add(8);
		
		Iterator itr = ll.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		ListIterator ltr = ll.listIterator();
		while(ltr.hasNext())
			System.out.print(ltr.next() + " ");
		System.out.println();
		while(ltr.hasPrevious())
			System.out.print(ltr.previous() + " ");
		System.out.println();
		Spliterator spitr = ll.spliterator();
		spitr.forEachRemaining(ele -> System.out.print(ele + " "));
	}
}
