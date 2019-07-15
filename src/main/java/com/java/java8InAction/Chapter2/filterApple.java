package com.java.java8InAction.Chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class filterApple {

	public static List<Apple> filterGreenApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple:inventory) {
			if("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	
	public static List<Apple> filterApplesByColor(List<Apple> inventory,String color){
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple:inventory) {
			if(apple.getColor().equals(color)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	public static List<Apple> filterApplesByWeight(List<Apple> inventory,Integer weight){
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple:inventory) {
			if(apple.getWeight()>weight) {
				result.add(apple);
			}
		}
		return result;
	}
	
	public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate p){
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple:inventory) {
			if(p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	public static void printApple(List<Apple> inventory,ApplePredicate p) {
		for(Apple apple:inventory) {
			String str =p.print(apple);
			System.out.append(str);
		}
	}
	
	public static <T> List<T> filter(List<T> t,Predicate<T> p){
		List<T> result = new ArrayList<T>();
		for(T t1:t) {
			if(p.test(t1)) {
				result.add(t1);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<Apple>();
		List<Apple> redApple = filterApples(inventory,new ApplePredicate() {
			
			@Override
			public boolean test(Apple apple) {
				// TODO Auto-generated method stub
				return apple.getColor().equals("red");
			}
			
			@Override
			public String print(Apple apple) {
				// TODO Auto-generated method stub
				return apple.getColor();
			}
		});
		System.out.println(redApple);
		
		filter(inventory, (Apple apple) -> "red".equals(apple.getColor()));
		
		inventory.sort((Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
		
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello");
			}
		});
		t.start();
		
		Thread t2 = new Thread(() -> System.out.println("hello"));
		t2.start();
		
		redApple = Optional.ofNullable(redApple).orElseGet(null);
		
	}
}
