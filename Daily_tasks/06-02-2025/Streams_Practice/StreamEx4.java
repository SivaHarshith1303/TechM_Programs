package streamsExamples;

import java.util.stream.IntStream;

public class StreamEx4 {
	public static void main(String[] args)
	{
		IntStream.range(1,6).filter(i -> i%2 == 0).forEach(System.out::println);
		
		IntStream.of(1,2,3,4,5,6).filter(i -> i%2 == 0).forEach(System.out::println);
	}
}
