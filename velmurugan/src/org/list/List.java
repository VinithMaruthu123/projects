package org.list;

import java.util.*;

public class List {
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
	
		
		l.add("Pandi");		   //0 
		l.add(26);			  //1
		l.add(93892136498l);	//2
		l.add(false);			//3
		l.add(97298621.72987f);	//4
		l.add(297392178.721398d); //5
		l.add('M');				//6
		
		System.out.println(l);
		
		l.remove(false);
		System.out.println(l);

		
		l.set(1, 25);
		System.out.println(l);
	}

}
