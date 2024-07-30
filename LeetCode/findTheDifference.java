import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        char ret = findTheDifference(s, t);
        System.out.println(ret);
    }

    public static char findTheDifference(String s, String t) {
        int total = 0;
        for (int i = 0; i < t.length(); i++) {
            total += t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            total -= s.charAt(i);
        }
        return (char) total;
    }
}
