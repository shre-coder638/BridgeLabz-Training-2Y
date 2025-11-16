package numsum;

import java.util.*;

public class NumericSum {
	public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;

        for (Number num : list) {
            sum += num.doubleValue();  
           }

        return sum;
    }
	
	public static void main(String[] args) {
		
		List<Integer> L1 = Arrays.asList(10, 20, 30, 40);
        System.out.println("Sum of Integers: " + sumNumbers(L1));

        List<Double> L2 = Arrays.asList(1.5, 2.5, 3.0);
        System.out.println("Sum of Doubles: " + sumNumbers(L2));		
	}
}