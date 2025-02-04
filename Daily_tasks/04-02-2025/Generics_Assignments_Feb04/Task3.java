package genericsAssignment_Feb04;
import java.util.ArrayList;
public class Task3 {
	public static void main(String[] args)
	{
		ArrayList arr = new ArrayList<>();
		
		arr.add(1);arr.add(3);arr.add(5);
		arr.add(2);arr.add(4);arr.add(6);
		
		arr.add("abc");arr.add("cde");arr.add("efg");
		arr.add("bcd");arr.add("def");arr.add("fgh");
		
		arr.add(12.3f);
		arr.add(15.339);
		arr.add(true);
		
		GenericTask3<ArrayList,String> obj = new GenericTask3<>(arr,-1);
		
		System.out.println(obj.findIdx());
	}
}
