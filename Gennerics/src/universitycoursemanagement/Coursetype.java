package universitycoursemanagement;

public abstract class Coursetype {
 private final String name;
 protected Coursetype(String name) { this.name = name; }
 public String getName() { return name; }
 public String evaluationSummary() { return "Evaluation: " + name; }
}

class ExamCourse extends Coursetype { ExamCourse(){ super("Exam Based"); } }
class AssignmentCourse extends Coursetype { AssignmentCourse(){ super("Assignment Based"); } }
class ResearchCourse extends Coursetype { ResearchCourse(){ super("Research Based"); } }