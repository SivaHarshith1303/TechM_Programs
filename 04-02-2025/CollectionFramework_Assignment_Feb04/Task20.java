package arrayList_Assignments_Feb04;
import java.util.LinkedList;
public class Task20 {
	public static void main(String[] args)
	{
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("Hyderabad");
		ll1.add("Vizag");
		ll1.add("Eluru");
		ll1.add("Vijayawada");
		ll1.add("Guntur");
		ll1.add("Vijayawada");
		ll1.add("Vizag");
		
		String ele = "Vizag";
		System.out.println("First Occurance : " + getFirstOccurance(ele,ll1));
		System.out.println("Last Occurance : " + getLastOccurance(ele,ll1));
	}
	public static int getFirstOccurance(String ele,LinkedList<String> ll)
	{
		for(int i=0;i<ll.size();i++)
		{
			if(ll.get(i).equals(ele))
				return i;
		}
		return -1;
	}
	public static int getLastOccurance(String ele,LinkedList<String> ll)
	{
		for(int i=ll.size()-1;i>=0;i--) {
			if(ll.get(i).equals(ele))
				return i;
		}
		return -1;
	}
}
