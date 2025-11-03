package school.util;

import school.data.Student;

public class Analyze {

    public double Average(Student s) {
        return (s.getMarks1() + s.getMarks2() + s.getMarks3()) / 3.0;
    }

    public char findGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 75) return 'B';
        else if (average >= 60) return 'C';
        else if (average >= 40) return 'D';
        else return 'F';
    }
}
