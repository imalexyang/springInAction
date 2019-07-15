package com.java.java8InAction.NewFeature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		eval(list,(a) -> true);
		System.out.println();
		eval(list,(n) -> n % 2 == 0);
		System.out.println();
		eval(list,(n) -> n>3);
		
		
	}
	
	public static void eval(List<Integer> list,Predicate<Integer> p) {
		for(Integer i:list) {
			if(p.test(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
