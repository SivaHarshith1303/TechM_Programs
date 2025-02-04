package arrayList_Assignments_Feb04;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
public class Task2 {
	public static void main(String[] args)
	{
		ArrayList<Integer> arrli = new ArrayList<>();
		arrli.add(1);arrli.add(3);arrli.add(5);
		arrli.add(2);arrli.add(4);arrli.add(6);
		
		Iterator itr = arrli.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ListIterator ltr = arrli.listIterator();
		
		while(ltr.hasNext())
			System.out.println(ltr.next());
		
		// Printing the arrylist in the reverse order 
		
		while(ltr.hasPrevious())
			System.out.println(ltr.previous());
		
		Spliterator spitr = arrli.spliterator();
		
		spitr.forEachRemaining(System.out::println);
	}
}
