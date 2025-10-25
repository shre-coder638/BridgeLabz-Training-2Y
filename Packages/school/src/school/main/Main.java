package school.main;

import school.data.*;   
import school.util.*;   

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Aarav Mehta", 85, 92, 78);

        Analyze analyzer = new Analyze();

        double avg = analyzer.calculateAverage(s1);
        char grade = analyzer.findGrade(avg);

        System.out.println("=== Student Performance Report ===");
        System.out.println(s1.toString());
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
    }
}
