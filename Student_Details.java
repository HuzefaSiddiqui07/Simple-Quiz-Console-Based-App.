package com.corejava.quizapplication;

import java.util.Scanner;

public class Student_Details {
	
	// Create Method
	
	public void getStudentDetails() {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your name");
	String stdName = sc.next();
	
	System.out.println("Enter your roll.no:");
	int rollNumber = sc.nextInt();
	System.out.println("------------------------------------------------------------------------------");
	
	System.out.println("Show Student Details");
    System.out.println("Student Name is >>> " + stdName);
	System.out.println("Student Roll.No: " + rollNumber);
	
	System.out.println("------------------------------------------------------------------------------");

	   }
    }
