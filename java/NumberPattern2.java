import java.util.*;

public class NumberPattern2 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
