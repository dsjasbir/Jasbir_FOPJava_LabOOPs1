package com.greatlearning.emailapp.service;

import java.util.Random;

import com.greatlearning.emailapp.model.Employee;

public class CredentialService {
	
	public String generateEmailAddress(Employee e) {
		
		return e.getFirstName() + e.getLastName() + "@" + e.getDepartment() + ".gl.com";
		
	}

	public void showCredentials(Employee e) {
		
		System.out.println("Dear " + e.getFirstName() + " your generated credentials are as follows");
		System.out.println(generateEmailAddress(e).toLowerCase());
		System.out.println(generatePassword());
		
	}

	public String  generatePassword(){
		
		Random rn = new Random();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i<8; i++) { 
			sb.append((char)(rn.nextInt(127-32)+32));	
		
		}	
			
		return sb.toString();
	}
	
}


