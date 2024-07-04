package com.tnsif.dayeighteen;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		
		Integer a[]= {10,45,60,40,50,95,70};
		
		Stream<Integer> numStream=Arrays.stream(a);
		
		//Fetch only even values
		Stream<Integer> evenStream=numStream.filter((n)->n%2==0);
		evenStream.forEach(System.out::println);
		System.out.println("______________________________________________");
		
		//Fetch only above 50 numbers
		numStream=Arrays.stream(a);
		Stream<Integer> filterStream=numStream.filter((n)->n>50);
		filterStream.forEach(System.out::println);
		System.out.println("______________________________________________");
		
		//filter using predicate object
		numStream=Arrays.stream(a);
		Predicate<Integer> oddPredicate=(n)-> n%2 != 0;
		numStream=numStream.filter(oddPredicate);
		numStream.forEach(System.out::println);
		System.out.println("______________________________________________");
		
		//String Array
		String[] cities= {"Pune","Nashik","Delhi","Chennai","Mumbai"};
		Stream<String> cityStream=Arrays.stream(cities);
		
		Predicate<String> cityPredicate=(s) -> s.endsWith("i");
		cityStream = cityStream.filter(cityPredicate);
		
		cityStream.forEach(System.out::println);
		
		
		
	}

}
