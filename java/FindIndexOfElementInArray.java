import java.util.*;

public class FindIndexOfElementInArray {
    public static void main(String args[]) {
        int[] arr = { 1, 5, 6, 7, 89, 2 };
        int a = 5;
        int result = findIndex(arr, a);
        System.out.println("array index of " + a + ":" + result);
    }

    public static int findIndex(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }
        return -1;

    }
}
