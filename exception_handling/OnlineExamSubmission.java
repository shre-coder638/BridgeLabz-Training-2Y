package exception_handling;

import java.time.LocalDateTime;

class LateSubmissionException extends Exception {
 public LateSubmissionException(String message) {
     super(message);
 }
}

class InvalidFileFormatException extends Exception {
 public InvalidFileFormatException(String message) {
     super(message);
 }
}

class ExamPortal {
 private static final LocalDateTime DEADLINE =
         LocalDateTime.of(2025, 11, 3, 23, 59);
 
 public void submitExam(String fileName, LocalDateTime submissionTime)
         throws LateSubmissionException, InvalidFileFormatException {

     if (!fileName.endsWith(".pdf")) {
         throw new InvalidFileFormatException("Submission failed: invalid file format.");
     }

     if (submissionTime.isAfter(DEADLINE)) {
         throw new LateSubmissionException("Submission failed: exam submitted after the deadline.");
     }

     System.out.println("Exam submitted successfully: " + fileName);
 }
}

public class OnlineExamSubmission {
 public static void main(String[] args) {
     ExamPortal portal = new ExamPortal();

     try {
         String fileName = "AnswerSheet.pdf";
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
 }
}
