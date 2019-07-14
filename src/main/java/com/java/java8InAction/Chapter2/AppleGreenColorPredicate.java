package com.java.java8InAction.Chapter2;

public class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return "green".equals(apple.getColor());
	}

	@Override
	public String print(Apple apple) {
		// TODO Auto-generated method stub
		return apple.getColor();
	}

}
