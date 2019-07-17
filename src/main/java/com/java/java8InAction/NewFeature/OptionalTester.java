package com.java.java8InAction.NewFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> str = Arrays.asList("bcs","fds","ewr","jkl","yui","ads","poi","cxz","ljk","dws","","zcx");
		
		Optional<?> optional = Optional.empty();
		optional.equals(optional);
		
		System.out.println(optional.equals(optional));
		
		List<String> str2 = Optional.ofNullable(str).filter(s -> s.size() == 12).get();
		
		System.out.println(str2);
		
		Optional<Integer> str3 = Optional.ofNullable(str).map(s -> s.size());
		
		System.out.println(str3);
		
		Optional.ofNullable(str).ifPresent(System.out::println);
		
		
		System.out.println(Optional.of("11"));
		
		str = null;
		List<String> str4 = Optional.ofNullable(str).orElse(new ArrayList<String>());
		
		System.out.println(str4);
		
		Optional.ofNullable(str).orElseGet(() -> new ArrayList<String>());
		
		System.out.println(str4);
		
		Optional.ofNullable(str).orElseThrow(() -> new NullPointerException());
		
		
		
	}

}
