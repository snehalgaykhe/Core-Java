package com.tnsif.dayeighteen;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		
		// Predicate Functional interface has test() method which accepts any object and return boolean value
		
		//accept Integer and returns true if number if positive otherwise false
		Predicate<Integer> predicateObj=(n)->n>0;
		
		//acquire a stream of Integers
		Stream<Integer> numStream=Stream.of(1,3,5,4,7,8,-5,6,-9);
		//filter() accepts predicate object - filters only positive values 
		numStream=numStream.filter(predicateObj);
		numStream.forEach(System.out::println);//for (int n:numStream)System.out.println(n);
		
		//Consumer Functional interface has accept method which accepts value and dose not return anything 
		Consumer<String> consumerObj=(s) ->System.out.println(s.toUpperCase());
		Stream<String> cityStream=Stream.of("Nashik","Pune","Mumbai","Chennai","Delhi","Banglore","Ahmednagar");
		
		//forEach - perform action on each elements of stream
		cityStream.forEach(consumerObj);
		
		//Supplier Fumctional Interface has get() method which returns an object but dose not accept any value 
		Supplier<Integer> supplierObj=()->{ return (10);};
		System.out.println(supplierObj.get());
		
		Supplier<String> suppObj=()->"Hello Students !";
		System.out.println(suppObj.get());
		
		//Function
		Function<String, Integer> getLenght=(s)->s.length();
		cityStream=Stream.of("Nashik","Pune","Mumbai","Chennai","Delhi","Banglore","Ahmednagar");
		//map() intermidiate function receives function as a parameter
		numStream=cityStream.map(getLenght);
		numStream.forEach(System.out::println);
		System.out.println("______________________________________________________________");
		

		numStream=Stream.of(2,5,4,3,67,8);
		numStream=numStream.map((n)->n*n*n);
		numStream.forEach(System.out::println);
		
		numStream=Stream.of(2,5,4,3,67,8);
		System.out.println("______________________________________________________________");
		
		
		Function<Integer, Double> sqrtFunction=(n)->Math.sqrt(n);
		Stream<Double> sqrtStream=numStream.map(sqrtFunction);
		List<Double> sqrtList=sqrtStream.collect(Collectors.toList());
		System.out.println(sqrtList);
		System.out.println("______________________________________________________________");
		
		//BiFunction<T,U,R>
		//reduce()
		numStream=Stream.of(2,5,4,3,67,8);
		Optional<Integer> sum=numStream.reduce((a,b)->a+b);
		
		if(sum.isPresent())
			System.out.println("Sum is "+sum);
		
		numStream=Stream.of(2,5,4,3,67,8);
		Optional<Integer> max=numStream.reduce((a,b)->{
			if(a>b)
				return a;
			else {
				return b;
				
			}
		});
		
		if(max.isPresent()) {
			System.out.println("Max is "+max);
		}
		
		numStream=Stream.of(2,5,4,3,67,8);
		Optional<Integer> min=numStream.reduce((a,b)->a<b?a:b);
		
		if(min.isPresent()) {
			System.out.println("Min is "+min);
			
		}
		
		BinaryOperator<Integer> sumFunction=(a,b)->a+b;
		numStream=Stream.of(2,5,4,3,67,8);
		sum=numStream.reduce(sumFunction);
		
		if(sum.isPresent()) {
			System.out.println("Sum is "+sum);
		}
		
		
		
		/* Consumer
		Supplier
		Function
		BiFunction*/

	}

}
