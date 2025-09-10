import java.util.Scanner;

public class RemoveDuplicateString{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        char[] charArray= input.toCharArray(); 
        for (char c : charArray) {
            System.out.println(c);            
        }
        String[] ve = new String[input.length()]; 
        for (int i = 0; i < input.length(); i++) {
            String a = charArray[i];
            int c = 0;
            for (int j = 0; j < i; j++) {
                if (a.equals(charArray[j])) {
                    c++;
                }
            }
            if (c == 1) {
                    ve[i] = a;
            }else{
                ve[i] = "";
            }
        }
        String result = "";
        for (int i = 0; i < ve.length; i++) {
            result += ve[i];
        }
        System.out.println("String after removing duplicate characters: " + result);
        sc.close();

    }    
}
