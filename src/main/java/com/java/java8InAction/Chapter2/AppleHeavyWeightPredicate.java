package com.java.java8InAction.Chapter2;

public class AppleHeavyWeightPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return apple.getWeight() > 150;
	}

	@Override
	public String print(Apple apple) {
		// TODO Auto-generated method stub
		return apple.getWeight() > 150 ? "heavy" : "weight";
	}


}
