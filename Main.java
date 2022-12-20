package com.corejava.quizapplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	System.out.println("========================= Quiz Started =========================");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number of students who are going to take the quiz");
	int number = sc.nextInt();
	
	for (int i = 1; i <= number; i++) {
		
		// Create an Object of 'Student_Details' Class
	
	Student_Details student = new Student_Details();
	
	// Call Method by 'student' Object
	
	   student.getStudentDetails();
		
	
	   // Create an Object of Quiz Class
	   
		    Quiz quiz = new Quiz();
		    
		 // Call Method by 'quiz' Object
		
		     quiz.getLogic();
	    }

    }
}



	
