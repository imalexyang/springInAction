package com.java.java8InAction.Chapter3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.java.java8InAction.Chapter2.Apple;

public class Quote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Apple> result = new ArrayList<Apple>();
		
		
		result.sort(Comparator.comparing(Apple::getWeight));
		
		
	}

}
