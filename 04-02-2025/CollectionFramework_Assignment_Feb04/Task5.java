package arrayList_Assignments_Feb04;
import java.util.ArrayList;
public class Task5 {
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
		
		System.out.println("Before Updation : " + arrli);
		
		// Updating the element in the arraylist
		
		arrli.set(0, 32);
		arrli.set(2, 15);
		arrli.set(4, 17);
		
		System.out.println("After Updation : " + arrli);
	}
}
