package com.ExceptionPropagation;

import java.util.ArrayList;

public class FileHandler {
	  static ArrayList<String> files = new ArrayList<>();

	  static {
	       files.add("data.txt");
	       files.add("report.pdf");
	       files.add("notes.docx");
	   }

	  public FileHandler(String fileName) throws FileMissingException {
	       System.out.println("Attempting to open file: " + fileName);

	       if (!files.contains(fileName)) {
	           throw new FileMissingException("File not found: " + fileName);
	       }

	       System.out.println("File '" + fileName + "' opened successfully!");
	   }
	  }