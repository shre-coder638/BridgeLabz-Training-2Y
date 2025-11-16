package copylist;

import java.util.*;

public class CopyElements {

    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number num : src) {
            dest.add(num);
        }
    }

    public static void main(String[] args) {

        List<Number> destList = new ArrayList<>();
        List<Double> srcList = Arrays.asList(1.5, 2.5);

        System.out.println("Destination List: " + destList);

        copyList(destList, srcList);

        System.out.println("Target List: " + srcList);
        System.out.println("Destination List: " + destList);
    }
}