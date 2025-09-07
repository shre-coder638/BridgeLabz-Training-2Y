import java.util.Scanner;

class Kmtomiles {
    public static void main(String[] args) {
     
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in KM: ");
        int Km = input.nextInt();
        double miles = Km * 0.6;
       System.out.println("The total miles is " + miles + " mile for the given " + Km + " km");
    }
}
