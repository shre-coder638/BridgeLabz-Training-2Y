// Creating Class with name DisplayResult indicating the purpose is to display 
// result. Notice the class name is a Noun.
class Pen_distribution {
    public static void main(String[] args) {
     
        // Create a string variable name and assign value Sam
        int totalPens = 14;
        int students = 3;
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

       System.out.println("Each student will receive " + pensPerStudent + " pens.");
       System.out.println("There are " + remainingPens + " remaining pens.");
    }
}
