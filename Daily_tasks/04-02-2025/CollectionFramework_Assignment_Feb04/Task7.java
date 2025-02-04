package arrayList_Assignments_Feb04;
import java.util.ArrayList;
import java.util.Scanner;
public class Task7 {
	public static void main(String[] args)
	{
		ArrayList<String> arrli = new ArrayList<>();
		arrli.add("Telangana");
		arrli.add("Andhra Pradhesh");
		arrli.add("Karnataka");
		arrli.add("Kerala");
		arrli.add("Maharastra");
		arrli.add("Delhi");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the state which you want to seach : ");
		String state = sc.nextLine();
		
		if(searchState(state,arrli))
			System.out.println("Yes, the state is present in the arraylist");
		else 
			System.out.println("No, the state is not present in the arraylit");
	}
	public static boolean searchState(String state,ArrayList<String> arrli)
	{
		state = state.toLowerCase();
		for(String s : arrli)
		{
			s = s.toLowerCase();
			if(s.equals(state))
				return true;
		}
		return false;
	}
}
