package com.java.java8InAction.Chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.java.java8InAction.Chapter4.Dish;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Dish> menu = Arrays.asList(new Dish("pork",false,800,Dish.Type.MEAT)
				,new Dish("beef",false,700,Dish.Type.MEAT)
				,new Dish("chicken",false,400,Dish.Type.MEAT)
				,new Dish("french fries",true,530,Dish.Type.OTHER)
				,new Dish("rice",true,350,Dish.Type.OTHER)
				,new Dish("season fruit",true,120,Dish.Type.OTHER)
				,new Dish("pizza",true,550,Dish.Type.OTHER)
				,new Dish("prawns",false,350,Dish.Type.FISH)
				,new Dish("salmon",false,450,Dish.Type.FISH));
		
		if(menu.stream().anyMatch(d -> d.isVegetarian())) {
			System.out.println("The menu is (somewhat) vegetarian friendly!!");
		}
		
		Optional<Dish> any = menu.stream().filter(Dish::isVegetarian).findAny();
		
		System.out.println(any.get().getName());
		
		
		Stream<String>  s = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");
		s.map(String::toUpperCase).forEach(System.out::println);
		
		int[] numbers = {2, 3, 5, 7, 11, 13};
		int sum = Arrays.stream(numbers).sum();
		System.out.println(sum);
		
		
	}

}
