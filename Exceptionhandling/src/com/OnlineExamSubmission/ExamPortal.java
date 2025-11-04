package com.OnlineExamSubmission;

import java.time.LocalDateTime;

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