import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 10, 55, 70, 95, 110, 189};
        int search = 44, f = 0, l = a.length - 1;
        boolean found = false;

        while (f <= l) {
            int mid = (f + l) / 2;
            if (a[mid] == search) {
                System.out.println("Value found at " + mid);
                found = true;
                break;
            }
            if (search > a[mid]) {
                f = mid + 1;
            }
            if (search < a[mid]) {
                l = mid - 1;
            }
        }
        if (found==false) {
            System.out.println("Value Not found");
        }
    }
}
