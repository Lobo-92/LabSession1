package com.greatlearning.credentialservice;

import java.util.Scanner;
import com.greatlearning.model.Employee;

public class Driver {
	
	public static void main(String[] args) {
		
		CredentialService cred = new CredentialService();
		
		System.out.println("Enter your First Name: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		
		System.out.println("Enter your Last Name: ");
		String lastName = sc.nextLine();
		
		Employee e = new Employee(firstName, lastName);
		
		int ch;
		do {
			
			System.out.println("Please enter the department from the following.\n"
					+ "1. Technical.\n"
					+ "2. Admin.\n"
					+ "3. Human Resource.\n"
					+ "4. Legal.");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				String email = cred.generateemailaddress(e.getFirstName(), e.getLastName(), "tech");
				char[] password = cred.generatePassword();
				cred.showCredentials(e,email, password);
				break;
			case 2:
				String email2 = cred.generateemailaddress(e.getFirstName(), e.getLastName(), "admin");
				char[] password2 = cred.generatePassword();
				cred.showCredentials(e,email2, password2);
				break;
			case 3:
				String email3 = cred.generateemailaddress(e.getFirstName(), e.getLastName(), "hr");
				char[] password3 = cred.generatePassword();
				cred.showCredentials(e,email3, password3);
				break;
			case 4:
				String email4 = cred.generateemailaddress(e.getFirstName(), e.getLastName(), "legal");
				char[] password4 = cred.generatePassword();
				cred.showCredentials(e,email4, password4);
				break;
				
			default:
				break;
			}
			
		}while(ch<=4);
		
		sc.close();
	}
}

