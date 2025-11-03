package exception_handling;

import java.util.Scanner;

class InvalidStudentException extends Exception {
 public InvalidStudentException(String message) {
     super(message);
 }
}

class NetworkException extends Exception {
 public NetworkException(String message) {
     super(message);
 }
}

class OnlineExam {

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

public class OnlineExamSystem {
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
