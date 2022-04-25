package org.base;

import java.util.Scanner;

public class DriverInfo{
	
	public static void main(String[] args) {
		
		
		Scanner D = new Scanner(System.in);
		String name = D.next();
		System.out.println(name);
		int Id = D.nextInt();
		System.out.println(Id);
		byte Age = D.nextByte();
		System.out.println(Age);
		long mobileno = D.nextLong();
		System.out.println(mobileno);
		boolean Gender = D.nextBoolean();
		System.out.println(Gender);
		float PFno = D.nextFloat();
		System.out.println(PFno);
		double salary = D.nextDouble();
		System.out.println(salary);
		short PinNo = D.nextShort();
		System.out.println(PinNo);
	}
	
	
}
