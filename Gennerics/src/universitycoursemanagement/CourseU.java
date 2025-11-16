package universitycoursemanagement;

import java.util.*;

public class CourseU {
	 public static void displayCourses(List<? extends Course<?>> courses) {
	     for (Course<?> c : courses) {
	         System.out.println(c);
	         System.out.println("  " + c.getType().evaluationSummary());
	         System.out.println("  Enrolled: " + c.getStudents());
	         System.out.println();
	     }
	 }
	}