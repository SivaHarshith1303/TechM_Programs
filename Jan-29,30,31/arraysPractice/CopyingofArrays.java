package arraysPractice;
import java.util.Arrays;
public class CopyingofArrays {
	public static void main(String[] args)
	{
		// 1. arrayCopy() 2. copyOfRange()
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {5,4,3,2,1};
		System.arraycopy(arr1, 0, arr2, 5, 0);
		callPrint(arr2);
		System.arraycopy(arr1, 2, arr2, 0, 2);
		callPrint(arr2);
		/* 
		 This will return an error because array index out of bounds occur. 
			System.arraycopy(arr1, 0, arr2, 7, 4);
			callPrint(arr2);
		*/
		int[] arr3 = Arrays.copyOf(arr2, 3);
		callPrint(arr3);
		int[] arr4 = Arrays.copyOfRange(arr2, 2, 4);
		callPrint(arr4);
		
		int[] arr5 = new int[5];
		arr5[0] = 1;arr5[1] = 2;arr5[2] = 3;arr5[3] = 4;arr5[4] = 5;
		int[] arr6 = new int[5];
		arr6[0] = 5;arr6[1] = 4;arr6[2] = 3;arr6[3] = 2;arr6[4] = 1;
		System.arraycopy(arr5, 0, arr6, 0, 3);
		callPrint(arr6);
	}
	public static void callPrint(int[] arr2)
	{
		for(int i : arr2)
			System.out.print(i + " ");
		System.out.println();
	}
}
