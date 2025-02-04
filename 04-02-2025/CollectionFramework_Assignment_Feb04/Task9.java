package arrayList_Assignments_Feb04;
import java.util.ArrayList;
import java.util.Collections;
public class Task9 {
	public static void main(String[] args)
	{
		ArrayList<String> arrli = new ArrayList<>();
		arrli.add("Telangana");
		arrli.add("Andhra Pradhesh");
		arrli.add("Karnataka");
		arrli.add("Kerala");
		arrli.add("Maharastra");
		arrli.add("Delhi");
		
		ArrayList<String> arrli2 = new ArrayList<>();
		System.out.println("Before copy to arrli2 : " + arrli2);
		arrli2.addAll(arrli);
		System.out.println("After copy to arrli2 : " + arrli2);
	}
}
