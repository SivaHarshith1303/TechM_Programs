package arrayList_Assignments_Feb04;
import java.util.ArrayList;
public class Task3 {
	public static void main(String[] args)
	{
		ArrayList<Integer> arrli = new ArrayList<>();
		arrli.add(1);arrli.add(2);arrli.add(3);
		arrli.add(4);arrli.add(5);arrli.add(6);
		
		System.out.println(arrli);
		
		// Adding an element at first 
		
		arrli.add(0,10);
		System.out.println(arrli);
	}
}
