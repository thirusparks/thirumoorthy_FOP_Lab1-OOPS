package com.greatlearning.itsupport.model;

import java.util.Random;

public class Service {
	
	public String generateEmailId(String firstName, String lastName, String domain) {
		return firstName.concat(lastName)+"@"+domain+".greatlearning.com";
	}
	
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers  = "0123456789";
		String specialChar = "@$&#*";
		Random random = new Random();
		String pwd = "";
		String cap = "";
		String small = "";
		String num = "";
		String special = "";
		String password = "";
		for (int i =0; i < 2; i++) {
			cap  += capitalLetters.charAt(random.nextInt(capitalLetters.length()));
		}
		for (int i =0; i < 2; i++) {
			small  += smallLetters.charAt(random.nextInt(smallLetters.length()));
		}
		for (int i =0; i < 2; i++) {
			num  += numbers.charAt(random.nextInt(numbers.length()));
		}
		for (int i =0; i < 2; i++) {
			special  += specialChar.charAt(random.nextInt(specialChar.length()));
		}
		pwd = cap.concat(small).concat(num).concat(special);
		for (int i =0; i < 8; i++) {
			password += pwd.charAt(random.nextInt(pwd.length()));
		}
		
		return password;
	}
	
	

}
