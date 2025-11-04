package com.NestedTry_CatchinPropagation;

public class NestedTryCatchPropagation {
	static void methodB() {
        try {
            System.out.println("Inside methodB...");

           int x = (int) (Math.random() * 3);

            if (x == 0)
                Integer.parseInt("abc");
            else if (x == 1)
                throw new NullPointerException("Null value found!");
            else
                System.out.println("No exception occurred in methodB.");

        } catch (NumberFormatException e) {
            System.out.println("Caught in methodB: NumberFormatException");
        }

        System.out.println("End of methodB.");
    }

    static void methodA() {
        try {
            methodB();
        } catch (NullPointerException e) {
            System.out.println("Caught in methodA: " + e.getMessage());
        }
        System.out.println("End of methodA.");
    }

}
