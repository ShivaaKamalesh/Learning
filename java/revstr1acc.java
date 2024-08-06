import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        
        String str1=sb.toString();
        System.out.println(str1);
       
    }
}