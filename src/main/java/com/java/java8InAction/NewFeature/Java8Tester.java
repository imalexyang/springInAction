package com.java.java8InAction.NewFeature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name1 = new ArrayList<String>();
		name1.add("google");
		name1.add("facebook");
		name1.add("amazon");
		name1.add("netflex");
		
		Collections.sort(name1, (s1,s2) -> s1.compareTo(s2));
		System.out.println(name1);
	}

}
