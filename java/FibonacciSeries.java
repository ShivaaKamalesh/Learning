import java.util.*;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number of terms");
        int n = sc.nextInt();

        int f = 1, s = 1, t;
        System.out.println(f);
        System.out.println(s);
        for (int i = 3; i < n; i++) {
            t = f + s;
            System.out.println(t);
            f = s;
            s = t;

        }
    }
}
// 1 1 2 3 5 8
/*
 * -->f=1(first term) s=1(second term) t=2(f+s)
 * -->f=1(first term) s=2(second term) t=3(f+s)
 * -->f=2(first term) s=3(second term) t=5(f+s)
 */