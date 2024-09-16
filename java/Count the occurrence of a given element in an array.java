import java.util.*;
public class Main{
    public static int countElement(int[] arr,int x){
        int count =0;
        for(int num:arr){
            if(num==x){
                count ++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int[] arr={3, 7, 2, 8, 1};
        int x=5;
        System.out.println(countElement(arr,x));
    }
}