// Creating Class with name DisplayResult indicating the purpose is to display 
// result. Notice the class name is a Noun.
class VolumeOfEarth {
    public static void main(String[] args) {
     
        // Create a string variable name and assign value Sam
        double pi = 3.14;
        int r1 = 6378;
        double r2 = r1 * 1.6;
        double v1 = (3.0/4.0) * pi * r1 * r1 * r1;
        double v2 = (3.0/4.0) * pi * r2 * r2 * r2;


       System.out.println("The volume of earth in cubic kilometers is " + v1 + " and cubic miles is " + v2);
       
    }
}
