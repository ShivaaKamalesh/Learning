import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        int arr[]={4,6,8,9,7,5,3,1};
        reverse(arr);
        System.out.println("reversed array ");
        for(int i :arr){
            System.out.println(i+" ");
        }
    }
    public static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1 ,temp;
        while(i<j){
            temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
    }
}
}