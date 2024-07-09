import java.util.*;

public class ArrayMaxMin {
    public static void main(String args[]) {
        int[] a = { 789, 5645, 6666, 7, 5, 41, 255, 1, 3, 0, 57878 };
        Arrays.sort(a);
        System.out.println("min=" + a[0]);
        System.out.println("max=" + a[a.length - 1]);
    }
}