package com.base;

public class Bank extends Bank2 {
	
	// mutable string
	// non literal String
	// keyword append , String buffer
public static void main(String[] args) {
	
	StringBuffer s = new StringBuffer("Velmurugan");
	System.out.println(s);
	int a = System.identityHashCode(s);
	System.out.println(a);
	
	System.out.println("");
	
	StringBuffer s1 = new StringBuffer("Gopi");
	System.out.println(s1);
	int b = System.identityHashCode(s1);
	System.out.println(b);
	
	System.out.println("");
	
	StringBuffer join = s.append(s1);
	System.out.println(join);
	int d = System.identityHashCode(join);
	System.out.println(d);

	
}








}// 3