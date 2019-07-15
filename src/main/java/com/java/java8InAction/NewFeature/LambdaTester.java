package com.java.java8InAction.NewFeature;

public class LambdaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathLog ml1 = (int a,int b) -> a + b;
		MathLog ml2 = (int a,int b) -> a - b;
		MathLog ml3 = (int a,int b) -> a * b;
		MathLog ml4 = (int a,int b) -> a / b;
		MathLog ml5 = (int a,int b) -> a % b;
		
		
		System.out.println(compute(8,5,ml1));
		System.out.println(compute(8,5,ml2));
		System.out.println(compute(8,5,ml3));
		System.out.println(compute(8,5,ml4));
		System.out.println(compute(8,5,ml5));
		
		
		String hello = "hello ";
		
		SaySomething ss1 = (a) -> System.out.println(a);
		SaySomething ss2 = (a) -> System.out.println(hello + a);
		//hello = "";
		say("my name is jack",ss1);
		say("my name is jack",ss2);
		
	}
	
	
	public interface MathLog{
		int compute(int a,int b);
	}
	
	public interface SaySomething{
		void say(String something); 
	}
	
	public static int compute(int a,int b,MathLog ml) {
		return ml.compute(a, b);
	}

	public static void say(String something,SaySomething ss) {
		ss.say(something);
	}
	
}
