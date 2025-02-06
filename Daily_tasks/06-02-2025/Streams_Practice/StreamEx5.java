package streamsExamples;

import java.util.stream.IntStream;
import java.util.OptionalInt;
import static streamsExamples.Display.*;
public class StreamEx5 {
	public static void main(String[] args)
	{
		print("Creating a stream");
		IntStream intStream = IntStream.of(1,2,3,4,5,6);
		
		print("Using reduce to calculate the sum ");
		
		OptionalInt optInt = intStream.reduce((i,j) -> i + j);
		
		print("Get ans : "+ optInt.getAsInt());
	}
}
