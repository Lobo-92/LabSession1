package com.greatlearning.credentialservice;

import java.util.Random;
import com.greatlearning.model.Employee;

public class CredentialService {

	public String generateemailaddress(String firstName, String lastName, String department) 
	{
		return firstName+"."+lastName+"@greatlearning."+department+".com";
	   }

	   public char[] generatePassword() {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$*><";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[8];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 0; i< 8 ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	   }
	   public void showCredentials(Employee e,String email, char[] generatePassword ) {
		   System.out.println("Dear "+e.getFirstName()+", your credentials are as follows");
		   System.out.println("Email ---> "+email);
		   System.out.println("Password ---> "+generatePassword);
	   }
}
