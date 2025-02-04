package genericsAssignment_Feb04;
import java.util.ArrayList;
public class Task2 {
	public static void main(String[] args){
		
		ArrayList<Integer> arrli = new ArrayList<>();
		for(int i=1;i<=10;i++)
			arrli.add(i);
		
		GenericTask2<Integer> obj1 = new GenericTask2<Integer>(arrli);
		
		obj1.calculate();
		
		System.out.println("Even sum is : " + obj1.evenSum());
		System.out.println("Odd sum is : " + obj1.oddSum());
	}
}
