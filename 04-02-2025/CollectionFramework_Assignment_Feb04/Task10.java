package arrayList_Assignments_Feb04;
import java.util.ArrayList;
import java.util.Collections;
public class Task10 {
	public static void main(String[] args)
	{
		ArrayList<String> arrli = new ArrayList<>();
		arrli.add("Telangana");
		arrli.add("Andhra Pradhesh");
		arrli.add("Karnataka");
		arrli.add("Kerala");
		arrli.add("Maharastra");
		arrli.add("Delhi");
		
		System.out.println("Before shuffle : " + arrli);
		Collections.shuffle(arrli);
		System.out.println("After shuffle : " + arrli);
	}
}
