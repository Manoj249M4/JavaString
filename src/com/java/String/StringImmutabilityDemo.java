package com.java.String;

public class StringImmutabilityDemo {

	
	public static void main(String args[]){
		String s1 = new String("Java");
		String s2 = "jAVa";
		String s3 = s2.concat(s1);
		System.out.println(s3.toUpperCase());
		
		
	}
}
