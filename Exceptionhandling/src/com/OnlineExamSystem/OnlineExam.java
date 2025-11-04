package com.OnlineExamSystem;

public class OnlineExam {

public void validateStudent(String studentId) throws InvalidStudentException {
     if (studentId == null || !studentId.equals("STU123")) {
         throw new InvalidStudentException("Invalid student ID! Access denied.");
     }
 }

public void submitExam(String studentId) throws InvalidStudentException, NetworkException {
     validateStudent(studentId);

     boolean networkIssue = Math.random() < 0.5;
     if (networkIssue) {
         throw new NetworkException("Network error occurred during submission.");
     }

     System.out.println("Exam submitted successfully for student: " + studentId);
 }
}
