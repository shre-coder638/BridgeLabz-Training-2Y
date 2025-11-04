package com.OnlineExamSubmission;

import java.time.LocalDateTime;
import java.util.*;

public class Runner {
	public static void main(String[] args) {
	     ExamPortal portal = new ExamPortal();
	     Scanner sc = new Scanner(System.in);

	     try {
	         String fileName = sc.nextLine();
	         LocalDateTime submissionTime = LocalDateTime.of(2025, 11, 3, 22, 30); 

	         portal.submitExam(fileName, submissionTime);
	     }
	     catch (InvalidFileFormatException e) {
	         System.out.println(e.getMessage());
	     }
	     catch (LateSubmissionException e) {
	         System.out.println(e.getMessage());
	     }
	     finally {
	         System.out.println("Submission process completed.");
	     }
	     sc.close();
	 }
}
