package org.emp;

import org.client.Client;
import org.company.Company;

public class Employee {
	private void employeeNamwe() {
		System.out.println("employee name is : Arun");
		

	}
	
	public static void main(String[] args) {
		
		Employee H = new Employee();
		H.employeeNamwe();
	

		Company D = new Company();
		
		D.companyName();
		
		
		Client N = new Client();
	
		N.clientName();
	}

	}

