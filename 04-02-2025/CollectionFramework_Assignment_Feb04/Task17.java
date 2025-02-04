package arrayList_Assignments_Feb04;
import java.util.LinkedList;
public class Task17 {
	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Hyderabad");
		ll.add("Vizag");
		ll.add("Eluru");
		ll.add("Vijayawada");
		ll.add("Guntur");
		
		System.out.println("Linked List : " + ll);
		// Add first 
		ll.addFirst("Bangalore");
		System.out.println("New Linked List : " + ll);
	}
}
