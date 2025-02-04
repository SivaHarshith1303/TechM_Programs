package genericsAssignment_Feb04;
import java.util.ArrayList;
public class Task4 {	
	public static void main(String[] args)
	{
		ArrayList arrli = new ArrayList<>();
		
		for(int i=0;i<5;i++)
			arrli.add(i);
		
		arrli.add("Siva");
		arrli.add("Harshith");
		arrli.add("naidu");
		arrli.add(true);
		
		GenericTask4<Object> obj = new GenericTask4<>(arrli);
		
		ArrayList ans = obj.reverse();
		
		for(Object i : ans)
			System.out.println(i);
	}
}
