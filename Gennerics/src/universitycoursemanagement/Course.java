package universitycoursemanagement;

import java.util.*;

public class Course<T extends Coursetype> {
	 private final String code;
	 private final String title;
	 private final T type;
	 private final List<String> students = new ArrayList<>();

	 public Course(String code, String title, T type) {
	     this.code = code; this.title = title; this.type = type;
	 }

	 public void enroll(String student) { students.add(student); }
	 public void withdraw(String student) { students.remove(student); }

	 public T getType() { return type; }
	 public List<String> getStudents() { return Collections.unmodifiableList(students); }

	 public String toString() {
	     return code + " - " + title + " (" + type.getName() + ")";
	 }
	}