import java.util.*;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int lh = sc.nextInt();
        System.out.println("enter height");
        int width = sc.nextInt();
        double a = lh * width;
        System.out.println(a);

    }
}
