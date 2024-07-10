import java.util.*;

public class CheckElementArray {
    public static void main(String args[]) {
        int[] arr = { 1, 5, 6, 7, 89, 2 };
        int a = 55;
        boolean result = resultElement(arr, a);
        System.out.println("array contain" + a + ":" + result);
    }

    public static boolean resultElement(int[] arr, int a) {
        for (int i : arr) {
            if (i == a) {
                return true;
            }
        }
        return false;

    }
}