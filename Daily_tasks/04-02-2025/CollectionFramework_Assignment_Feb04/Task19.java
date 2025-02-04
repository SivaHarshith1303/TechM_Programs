package arrayList_Assignments_Feb04;
import java.util.LinkedList;
public class Task19 {
	public static void main(String[] args)
	{
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("Hyderabad");
		ll1.add("Vizag");
		ll1.add("Eluru");
		ll1.add("Vijayawada");
		ll1.add("Guntur");
		
		LinkedList<String> ll2 = new LinkedList<>();
		ll2.add("apple");
		ll2.add("orange");
		ll2.add("mango");
		ll2.add("kiwi");
		
		System.out.println("Linked List : " + ll1);
		ll1.addAll(1,ll2);
		System.out.println("New Linked List : " + ll1);
	}
}
