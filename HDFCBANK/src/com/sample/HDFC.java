package com.sample;

public class HDFC extends IndianBank {
	
	public void saving() {
		System.out.println("HDFC bank saving : 10%");
          super.savings();
	
	}
	public void deposite() {
	System.out.println("HDFC Bank Deposite  : 12%");
 super.deposite();
}
	
	private void fixed() {
		System.out.println("HDFC Bank Fixed : 20%");

	}
	
	
	public static void main(String[] args) {
		
		HDFC a = new HDFC();
		a.saving();
		a.deposite();
		a.fixed();
		
	}
	
	
	
}
