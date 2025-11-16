package universitycoursemanagement;

import java.util.*;

public class University {
	 public static void main(String[] args) {
	     Course<ExamCourse> cs101 = new Course<>("CS101", "Data Structures", new ExamCourse());
	     Course<AssignmentCourse> eng201 = new Course<>("ENG201", "Creative Writing", new AssignmentCourse());
	     Course<ResearchCourse> cs699 = new Course<>("CS699", "Advanced Research", new ResearchCourse());

	     cs101.enroll("Alice");
	     cs101.enroll("Bob");
	     eng201.enroll("Clara");
	     cs699.enroll("Eve");

	     List<Course<?>> all = Arrays.asList(cs101, eng201, cs699);
	     CourseU.displayCourses(all);
	 }
}