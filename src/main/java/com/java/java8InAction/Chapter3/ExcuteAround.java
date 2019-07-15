package com.java.java8InAction.Chapter3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Predicate;

import com.java.java8InAction.Chapter2.Apple;

public class ExcuteAround {

	public static String processFile() throws FileNotFoundException, IOException {
		try(BufferedReader br = new BufferedReader(new FileReader("date.txt"))){
			return br.readLine();
		}
	}
	
	public static String processFile(BufferedReaderProcessor p) throws FileNotFoundException, IOException {
		try(BufferedReader br = new BufferedReader(new FileReader("date.txt"))){
			return p.process(br);
		}
	}
	
	public static void main(String args[]) throws FileNotFoundException, IOException {
		
			processFile((BufferedReader br) -> {
				try {
					return br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			});
			
			processFile((BufferedReader br) -> {
				try {
					return br.readLine() + br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			});
		   
	}
	
}
