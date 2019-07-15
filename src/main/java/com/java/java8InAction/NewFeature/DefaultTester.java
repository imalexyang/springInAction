package com.java.java8InAction.NewFeature;

public class DefaultTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechicle vechicle = new DefaultTester().new Car();
		vechicle.println();
		Vechicle.blowHorn();
	}

	public interface Vechicle{
		default void println() {
			System.out.println("I'm a vechicle.");
		}
		
		static void blowHorn() {
			System.out.println("bolw horn vechicle.");
		}
	}
	
	class Car implements Vechicle{
		public void println() {
			System.out.println("I'm a car.");
		}
		
		public void blowHorn() {
			System.out.println("bolw horn car.");
		}
	}
	
}
