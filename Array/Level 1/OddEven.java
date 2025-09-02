import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = input.nextInt();
        int b = (a/2) + 1;
        int[] odd = new int[b];
        int[] even = new int[b];

        for(int i = 0; i < a; i++){
            System.out.print("Enter a value for array: ");
            int num = input.nextInt();
            if(num % 2 == 0){
                even[i] = num;
            } else {
                odd[i] = num;
            }
        }
        System.out.print("Odd numbers: ");
        for(int i = 0; i < odd.length; i++){
            if(odd[i] != 0){
                System.out.print(odd[i] + " ");
            }
        }
        System.out.print("\nEven numbers: ");
        for(int i = 0; i < even.length; i++){
            if(even[i] != 0){
                System.out.print(even[i] + " ");
            }
        }
        input.close();    
    }
}