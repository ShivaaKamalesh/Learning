import java.util.*;
public class Main{
    public static boolean containElement(int[] arr,int x){
        for(int num:arr){
            if(num==x){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr={3, 7, 2, 8, 1};
        int x=5;
        System.out.println(containElement(arr,x));
    }
}