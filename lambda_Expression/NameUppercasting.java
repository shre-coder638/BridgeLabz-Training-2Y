package lambda_Expression;
import java.util.Scanner;

@FunctionalInterface
interface UC{
    String Upper(String a);
}

public class NameUppercasting {
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  String n = sc.nextLine(); 
	  UC f =(String a) -> n.toUpperCase();
	  System.out.println(f.Upper(n));
	  sc.close();
}
}
