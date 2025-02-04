package arraysPractice;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayCopyExample {
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6};
		int[] copy1 = arr;
		for(int i=0;i<copy1.length;i++)
			System.out.print(copy1[i] + " ");
		System.out.println();
		int[] arr2 = new int[3];
		arr2[0] = 1;arr2[1] = 2;arr2[2] = 3;
		int[] copy2 = arr2;
		for(int i : copy2)
			System.out.print(i + " ");
		System.out.println(arr == copy1);
		System.out.println(arr.equals(copy1));
		System.out.println(Arrays.equals(arr, copy1));
	}
}
