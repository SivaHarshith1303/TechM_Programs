package arraysPractice;
import java.util.Scanner;
import java.util.Arrays;
public class CloneOfArray {
	public static void main(String[] args)
	{
		int[] arr = {1,2,3};
		int[] clonedArray = arr.clone();
		System.out.println(arr == clonedArray);
		System.out.println(arr.equals(clonedArray));
		System.out.println(Arrays.equals(arr,clonedArray));
		for(int i=0;i<arr.length;i++)
			System.out.print(clonedArray[i] + " ");
		int[] arr2 = new int[3];
		arr2[0] = 1;arr2[1] = 2;arr2[2] = 3;
		int[] clonedArray2 = arr2.clone();
		System.out.println(arr2 == clonedArray2);
		System.out.println(arr2.equals(clonedArray2));
		System.out.println(Arrays.equals(arr2, clonedArray2));
	}
}
