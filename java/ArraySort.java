import java.util.*;

public class ArraySort {
    public static void main(String args[]) {
        int[] arr = { 777, 888, 999, 55565, 2121, 3, 5, 6, 1, 2, 20, 9, 55 };
        Arrays.sort(arr);
        System.out.println("Element in a sorted form");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
