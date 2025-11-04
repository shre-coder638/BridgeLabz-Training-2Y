package com.OnlineExamSystem;

import java.util.Scanner;



public class Runner {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     OnlineExam exam = new OnlineExam();

	     try {
	         System.out.print("Enter your student ID: ");
	         String studentId = sc.nextLine();

	         exam.submitExam(studentId);
	     } 
	     catch (InvalidStudentException e) {
	         System.out.println("Error: " + e.getMessage());
	     } 
	     catch (NetworkException e) {
	         System.out.println("Error: " + e.getMessage());
	     } 
	     finally {
	         System.out.println("Exam submission process completed.");
	         sc.close();
	     }
	 }

}
