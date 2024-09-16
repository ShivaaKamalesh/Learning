import java.util.*;
public class Main{
    public static double squareDifference(double num1,double num2){
        return Math.abs(Math.sqrt(num1)-Math.sqrt(num2));
    }
    public static void main(String args[]){
        double num1=10;
        double num2=20;
        System.out.println(squareDifference(num1,num2));
    }
}