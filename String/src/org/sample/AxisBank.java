package org.sample;

public class AxisBank { // Parent Class

	public static void main(String[] args) {
		
		// index    0123456789-------n-1
		String s = "Welcome To Java Class";
		System.out.println(s);  // Welcome To Java Class
		
		//  size of given string 
		int length = s.length();
		System.out.println(length); //21 
		
		// To Check String is empty or not
		boolean empty = s.isEmpty();
		System.out.println(empty); // false
		
		
		//  to find a character at a particular index 
		char charAt = s.charAt(5);
		System.out.println(charAt); // m
		
		// to  find index position of a particular character
		int indexOf = s.indexOf("e"); // First Occurrence 
		System.out.println(indexOf); // 1
		
		int lastIndexOf = s.lastIndexOf("e"); // last Occurrence
		System.out.println(lastIndexOf);// 6
		
		int indexOf2 = s.indexOf("z");
		System.out.println(indexOf2); // -1
		
		//to change the given string into upper case letters
		String upperCase = s.toUpperCase();
		System.out.println(upperCase); // WELCOME TO JAVA CLASS
		
		// to change the given string into lower case letters
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase); // welcome to java class
		
		// to check starts with a particular character
		boolean startsWith = s.startsWith("Welcome");
		System.out.println(startsWith); // true
		
		// to check ends with a particular character
		boolean endsWith = s.endsWith("Class");
		System.out.println(endsWith);//true
		
		// to check a particular character is present in the string or not
		boolean contains = s.contains("Welcome");
		System.out.println(contains); //true
		
		// to replace a particular character
		String replace = s.replace("e", "#");
		System.out.println(replace); // W#lcom# To Java Class
		
		
		String replaceAll = s.replaceAll("Java","Selenium");
		System.out.println(replaceAll); // Welcome To Selenium Class
		
		// to delete all characters present in string or remove unwanted space from string
		String trim = s.trim();
		System.out.println(trim); //Welcome To Java Class
		
		// to get the particular value from string.
		String substring = s.substring(7);
		System.out.println(substring); // To Java Class
		
		String substring2 = s.substring(0, 7);
		System.out.println(substring2); //Welcome
		
		// To Split the String
		String[] split = s.split(" ");
		
		for (String x : split) {

			System.out.println(x);
		
		}
		
		System.out.println("*********");
		
		String s1="welcome to java class";
		System.out.println(s1); // welcome to java class
		
		// to compare two strings and both are equal in case.
		boolean equals = s.equals(s1);
		System.out.println(equals);// false
		
		//to compare two strings , not case sensitive.
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase); // true
		
		System.out.println("***********");
		
		String s2 = "Hi Jack ";
		System.out.println(s2); // Hi Jack
		
		// to join two strings
		String concat = s2.concat(s);
		System.out.println(concat); // Hi Jack Welcome To Java Class

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


