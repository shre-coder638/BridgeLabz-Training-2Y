package resumesystem;

import java.util.*;

abstract class JobRole {
 abstract String name();
 abstract List<String> requiredSkills(); 
}

class SoftwareEngineer extends JobRole {
 String name(){ return "Software Engineer"; }
 List<String> requiredSkills(){ return Arrays.asList("java","algorithms","data-structures"); }
}

class DataScientist extends JobRole {
 String name(){ return "Data Scientist"; }
 List<String> requiredSkills(){ return Arrays.asList("python","ml","statistics"); }
}

class ProductManager extends JobRole {
 String name(){ return "Product Manager"; }
 List<String> requiredSkills(){ return Arrays.asList("communication","analytics","roadmapping"); }
}

class AIResume<T extends JobRole> {
 final String candidate;
 final T role;
 final List<String> skills; 

 AIResume(String candidate, T role, List<String> skills) {
     this.candidate = candidate;
     this.role = role;
     List<String> s = new ArrayList<>();
     for (String k : skills) s.add(k.toLowerCase());
     this.skills = s;
 }

 double score() {
     List<String> req = role.requiredSkills();
     int m = 0;
     for (String r : req) if (skills.contains(r)) m++;
     return req.isEmpty() ? 0 : (double) m / req.size();
 }

 @Override public String toString() {
     return candidate + " -> " + role.name();
 }
}

class Screening {
 static void screen(List<? extends AIResume<? extends JobRole>> resumes, double threshold) {
     for (AIResume<? extends JobRole> r : resumes) {
         String result = r.score() >= threshold ? "PASS" : "REVIEW";
         System.out.printf("%s | role=%s | score=%.2f | %s%n",
                 r.candidate, r.role.name(), r.score(), result);
     }
 }
}