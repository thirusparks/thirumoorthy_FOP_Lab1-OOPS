package com.greatlearning.itsupport.driver;

import java.util.Scanner;

import com.greatlearning.itsupport.model.Service;
import com.greatlearning.itsupport.model.Employee;

public class Driver {
	
	public static void main(String[] args) {
		Employee emp =  new Employee("thiru","moorthy");
		emp.getFirstName();
		emp.getlastName();
		
	Scanner sc = new Scanner(System.in);
	String email = "";
	String pass = "";
	System.out.println("Please enter your department : ");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resource");
	System.out.println("4. Legal");
	
	Service service  = new Service();
	int option = sc.nextInt();
	switch(option) {
	case 1:
		email = service.generateEmailId(emp.getFirstName(), emp.getlastName(), "tech");
		pass = service.generatePassword();
		break;
	case 2:
		email = service.generateEmailId(emp.getFirstName(), emp.getlastName(), "admin");
		pass = service.generatePassword();
		break;
	case 3:
		email = service.generateEmailId(emp.getFirstName(), emp.getlastName(), "hr");
		pass = service.generatePassword();
		break;
	case 4:
		email = service.generateEmailId(emp.getFirstName(), emp.getlastName(), "legal");
		pass = service.generatePassword();
		break;
	default:
		System.out.println("Enter a valid option");
		break;
	}
	
	System.out.println(email);
	System.out.println(pass);	
	
	
	}

}
