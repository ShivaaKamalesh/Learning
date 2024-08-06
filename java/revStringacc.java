import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        // String str="Hello";
        String str1="";
        char ch;
        
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            str1=ch+str1;
            // System.out.println(str1);
        }
            System.out.println(str1);
    }
}