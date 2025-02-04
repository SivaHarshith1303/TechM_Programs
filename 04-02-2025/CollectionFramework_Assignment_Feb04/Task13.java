package arrayList_Assignments_Feb04;

import java.util.LinkedList;

public class Task13 {
	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);ll.add(5);
		ll.add(2);ll.add(6);
		ll.add(3);ll.add(7);
		ll.add(4);ll.add(8);
		
		int start_idx = 3;
		for(int i=start_idx;i<ll.size();i++)
			System.out.print(ll.get(i) + " ");
	}
}
