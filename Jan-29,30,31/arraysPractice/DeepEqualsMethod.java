package arraysPractice;
import java.util.Arrays;
import java.util.Scanner;
public class DeepEqualsMethod {
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		Object[] obj1 = {arr1};
		Object[] obj2 = {arr2};
		System.out.println(Arrays.equals(obj1, obj2));
		System.out.println(Arrays.deepEquals(obj1, obj2));
	}
}
