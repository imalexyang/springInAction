package com.java.java8InAction.Chapter3;

import java.io.BufferedReader;

@FunctionalInterface
public interface BufferedReaderProcessor {
	String process(BufferedReader br);
}
