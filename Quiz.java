package com.corejava.quizapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
	
	int correctAnsCount = 0;
	int wrongAnsCount = 0;
	
	     // Create a Method
		public void getLogic() {
			
			SetQuestions q1 = new SetQuestions("Who is known as father of Java Programming Language?","A. James Gosling","B. M.P Java","C. Charel Babbage","D. Blais Pascal");
			SetQuestions q2 = new SetQuestions("Which provides runtime environment for java byte code to be executed?","A. JDK","B. JVM","C. JRE","D. JAVAC");
			SetQuestions q3 = new SetQuestions("Which symbol is used to contain the values of automatically initialized arrays?","A. Brackets","B. Braces","C. Parentheses","D. Comma");
			SetQuestions q4 = new SetQuestions("What is the full form of JVM ?","A. Java Very Large Machine","B. Java Verified Machine","C. Java Very Small Machine","D. Java Virtual Machine");
			SetQuestions q5 = new SetQuestions("Which of the following are not Java modifiers?","A. public","B. private","C. friendly ","D. transient");
			
			// Create Generic HashMap to Store the Correct Answers
			HashMap<SetQuestions , Character> hm = new HashMap<SetQuestions , Character>();
			
			hm.put(q1 , 'A');
			hm.put(q2 , 'B');
			hm.put(q3 , 'B');
			hm.put(q4 , 'D');
			hm.put(q5 , 'C');
			
			for(Map.Entry<SetQuestions , Character> map:hm.entrySet()) {
				
				System.out.println(map.getKey().getQuestion());
				System.out.println(map.getKey().getOption1());
				System.out.println(map.getKey().getOption2());
				System.out.println(map.getKey().getOption3());
				System.out.println(map.getKey().getOption4());
				
				// Create Scanner Object 
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Enter Your Answer >>> ");
				Character ans = scan.next().charAt(0);
				
				// Compare Answers
				int correctAns = Character.compare(ans , map.getValue());
				
				// Condition to check answers
				if (correctAns == 0) {
					
					System.out.println("Correct Answer");
					 correctAnsCount++;
				}
				else {
					System.out.println("Incorrect Correct!...Correct Answer is > " + map.getValue());
					  wrongAnsCount++;
				}
	System.out.println("---------------------------------------------------------------------------");
			}
			
			System.out.println();
			System.out.println("---------------Result----------------");
			System.out.println("Total Questions >>> " + hm.size());
			System.out.println("Correct Answered Questions >>> " + correctAnsCount);
			System.out.println("Wrong Answered Questions >>> " + wrongAnsCount);
			int percentage = (100 * correctAnsCount / hm.size());
			System.out.println("Percentage >>> " + percentage);
			
			if (percentage > 75) {
				
				System.out.println("Performance : Very Good");
			}
			else if (percentage < 35) {
				System.out.println("Performance : Very Poor");
			}
			else {
				System.out.println("Performance : Medium");
			}
			System.out.println("---------------------------------------------------------------------");
		}
	}


