package com.java.java8InAction.NewFeature;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strList = Arrays.asList("bcs","fds","ewr","jkl","yui","ads","poi","cxz","ljk","dws","","zcx");
		List<String> filterd = strList.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println(filterd);
		
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(343,43,23,43,43,54,65,23);
		List<Integer> sqList = numbers.stream().distinct().map(i -> i * i).collect(Collectors.toList());
		System.out.println(sqList);
		
		random.ints().limit(10).sorted().forEach(System.out::println);
		
		String joined = strList.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(","));
		System.out.println(joined);
		
		
		IntSummaryStatistics statics = numbers.stream().mapToInt( x -> x).summaryStatistics();
		
		System.out.println(Long.valueOf("1562596523000")/1000%2 == 0);
		
	}

}
