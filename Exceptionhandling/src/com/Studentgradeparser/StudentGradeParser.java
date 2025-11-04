package com.Studentgradeparser;

public class StudentGradeParser {
    public static void main(String[] args) {

    	String[] grades = {"90", "A+", "85", "B", "100"};

        for (String g : grades) {
            try {
                int n = Integer.parseInt(g);
                System.out.println("Valid grade: " + n);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + g);
            }
        }
    }
}
