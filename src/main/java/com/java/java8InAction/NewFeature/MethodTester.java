package com.java.java8InAction.NewFeature;

import java.util.Arrays;
import java.util.List;

public class MethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car =  Car.create(Car::new);
		car.name = "auto";
		
		List<Car> cars = Arrays.asList(car);
		
		cars.forEach(Car::collide);
		
		cars.forEach(Car::repair);
		
		Car police = Car.create(Car::new);
		police.name = "suv";
		cars.forEach(police::follew);
		
	}
	
	public interface Supplier<T>{
		T get();
	}

	
	static class Car{
		private String name;
		
		public static Car create(final Supplier<Car> sup) {
			return sup.get();
		}
		
		public static void collide(final Car car) {
			System.out.println(car.name);
		}
		
		public void follew(final Car another) {
			System.out.println(another.name);
		}
		
		public void repair() {
			System.out.println(this.name);
		}
		
	}
}
