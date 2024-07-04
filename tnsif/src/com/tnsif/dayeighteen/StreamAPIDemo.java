package com.tnsif.dayeighteen;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		//acquire a stream - stream of values
		Stream<Integer> numStream = Stream.of(1,5,3,7,2,8,5,2);
		//Terminal operation count() - count the total values
		System.out.println("Total Values: "+numStream.count());
		
		//IllegalStateException
		//System.out.println("Total Values: "+numStream.count());
		
		//Acquire a stream - stream of values
		numStream=Stream.of(1,5,3,7,2,8,5,2);
		//finding distinct values
		Stream<Integer> distinctNums=numStream.distinct();
		//counting distinct values
		long cnt=distinctNums.count();
		System.out.println("Total Values: "+cnt);
		
		//skip
		//Acquire a stream - stream of values
		numStream=Stream.of(1,5,3,7,2,8,5,2);
		// cnt=numStream.skip(-2).count();
		
		cnt=numStream.skip(3).count();
		System.out.println("Total Values aftre skipping 3 : "+cnt);
		
		//limit
		//Acquire a stream - stream of values
		numStream=Stream.of(1,5,3,7,2,8,5,2);
		numStream=numStream.limit(5);
		System.out.println("Total Values using limit (5) : "+numStream.count());
		
		//Terminal operation collect()
		numStream=Stream.of(1,5,3,7,2,8,5,2);
		List<Integer> numList=numStream.distinct().collect(Collectors.toList());
		System.out.println(numList);
		
		numStream=Stream.of(1,5,3,7,2,8,5,2);
		List<Integer> distinctNums1=numStream.limit(3).collect(Collectors.toList());
		System.out.println(distinctNums1);
		
		//ForEach
		numStream=Stream.of(1,5,3,7,2,8,5,2);
		//method reference
		numStream.forEach(System.out::println); //(System.out::print)
		
	}

}
