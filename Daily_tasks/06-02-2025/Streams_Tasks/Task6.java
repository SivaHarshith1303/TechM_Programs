package streamsTasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static streamsTasks.Display.*;
public class Task6 {
	public static void main(String[] args)
	{
		ArrayList<String> arrli = new ArrayList<>();
		arrli.add("Adilabad");
		arrli.add("Agra");
		arrli.add("Agarthala");
		arrli.add("Adoor");
		arrli.add("Hyderabad");arrli.add("Begumpet");
		arrli.add("Banagalore");arrli.add("Habsiguda");
		
		List<String> ascending = arrli.stream().sorted().collect(Collectors.toList());
		print("The sorted list in ascending order is : " + ascending);
		
		List<String> descending = arrli.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		print("The sorted list in descending order is : " + descending);
	}
}
