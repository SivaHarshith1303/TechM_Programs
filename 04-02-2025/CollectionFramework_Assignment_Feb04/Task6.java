package arrayList_Assignments_Feb04;
import java.util.ArrayList;
public class Task6 {
	public static void main(String[] args)
	{
		ArrayList<Integer> arrli = new ArrayList<>();
		arrli.add(1);
		arrli.add(2);
		arrli.add(3);
		arrli.add(4);
		arrli.add(5);
		arrli.add(6);
		arrli.add(7);
		arrli.add(8);
		
		// Removing the thrid element
		int idx_to_remove = 2;
		arrli.remove(idx_to_remove);
		System.out.println(arrli);
	}
}
