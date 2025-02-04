package arrayList_Assignments_Feb04;
import java.util.LinkedList;
public class Task16 {
	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Hyderabad");
		ll.add("Vizag");
		ll.add("Eluru");
		ll.add("Vijayawada");
		ll.add("Guntur");
		
		System.out.println(ll);
		// Add first 
		ll.addFirst("Bangalore");
		System.out.println("Adding first : " + ll);
		
		// Adding last 
		ll.addLast("Gurugram");
		System.out.println("Adding last : " + ll);
	}
}
