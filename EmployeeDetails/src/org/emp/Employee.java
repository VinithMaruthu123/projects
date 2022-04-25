package org.emp;

public class Employee {
	
	
	private void companyname() {
		System.out.println("company name : TCS");

	}
	
	private void empDob() {
		System.out.println("DOB : 26 may 1997");
		

	}

	private void empPhone() {
	System.out.println("Ph No: 8610564557");	

	}
	
	private void empEmail() {
		System.out.println("Email ID : vinith.26@gamil.com");

	}
	
	private void empAddress() {
		System.out.println(" Adress : No:92,TMP nagar,Mugappair,Chennai 37");

	}
	
	
	public static void main(String[] args) {
		
		Employee C = new Employee();
		C.companyname();
		C.empDob();
		C.empPhone();
		C.empEmail();
		C.empAddress();
		
	
		
		
	}
	
}




