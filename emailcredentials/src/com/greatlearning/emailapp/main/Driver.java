package com.greatlearning.emailapp.main;

import java.util.Scanner;

import com.greatlearning.emailapp.model.Employee;
import com.greatlearning.emailapp.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String[] deptName = {"Technical", "Admin", "Human Resource", "Legal"} ;
		final String[] deptCode = {"tech", "adm", "hr", "lg"} ;
		
		Employee em = new Employee("Jasbir", "Singh");
		
		System.out.println("Please Enter the Department from following");
		
		for(int i = 0; i < deptName.length; i++)
		    System.out.println(i+1 + "." + deptName[i]);

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();	
		
		sc.close();
		
		
		if(ch<=4 & ch>0){
			em.setDepartment(deptCode[ch-1]);
			
			CredentialService cs =  new CredentialService();
			cs.showCredentials(em);
			
		}
		else {	
			System.out.println("Please select a vaild department name");
		}
		
		
}
	
	
}