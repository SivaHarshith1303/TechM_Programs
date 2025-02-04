package arraysPractice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListPractice {
	public static void main(String[] args)
	{
		ArrayList arr = new ArrayList();
		arr.add("Siva");
		arr.add(1);
		arr.add(2.3f);
		System.out.println(arr);
		Iterator iteratorobj = arr.iterator();
		while(iteratorobj.hasNext())
		{
			Object obj = iteratorobj.next();
			System.out.println(obj);
		}
		ListIterator litr = arr.listIterator();
		while(litr.hasNext())
		{
			Object obj = litr.next();
			System.out.println(obj);
		}
		// Reverse order Traversal.
		while(litr.hasPrevious())
		{
			Object obj = litr.previous();
			System.out.println(obj);
		}
	}
}
