package genericsAssignment_Feb04;

public class GenericTask1 <T,V> {
	private T[] obj1;
	private V[] obj2;
	
	public GenericTask1(T []obj1,V []obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public boolean checkGenerics()
	{
		int length1 = obj1.length;
		int length2 = obj2.length;
		if(length1 != length2)
			return false;
		for(int i=0;i<length1;i++)
		{
			if(obj1[i] != obj2[i])
				return false;
		}
		return true;
	}
}
