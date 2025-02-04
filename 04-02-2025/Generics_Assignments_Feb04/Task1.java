package genericsAssignment_Feb04;

public class Task1 {
	public static void main(String[] args)
	{
		Integer[] arr1 = {1,2,3,4,6};
		Integer[] arr2 = {1,2,3,4,5};
		
		GenericTask1 <Integer,Integer> obj = new GenericTask1<Integer,Integer>(arr1,arr2);
		
		System.out.println("Are both arrays same : " + obj.checkGenerics());
		
	}
}
