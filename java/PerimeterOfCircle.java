;import java.util.Scanner;
import java.util.*;

public class PerimeterOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        int rad = sc.nextInt();
        double a = Math.PI *2 * rad;
        System.out.println(a);

    }
}
