package lambda_Expression;
import java.util.Scanner;

@FunctionalInterface
interface UC{
    String Upper(String a);
}

public class NameUppercasting {
   
	public static String printer(String d) {
		UC f =(String a) -> d.toUpperCase();
		return f.Upper(d);
	}
	
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  String n = sc.nextLine(); 
	  System.out.println(printer(n));
	  sc.close();
}
}
