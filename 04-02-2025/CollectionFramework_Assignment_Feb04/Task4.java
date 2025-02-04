package arrayList_Assignments_Feb04;
import java.util.ArrayList;
public class Task4 {
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
		
		// Retriving an elment at a specified index 
		
		System.out.println("Element at idx " + 0 + " is : " + arrli.get(0));
		System.out.println("Element at idx " + 3 + " is : " + arrli.get(03));
		System.out.println("Element at idx " + 2 + " is : " + arrli.get(02));
		System.out.println("Element at idx " + 6 + " is : " + arrli.get(06));
		System.out.println("Element at idx " + 7 + " is : " + arrli.get(07));
	}
}
