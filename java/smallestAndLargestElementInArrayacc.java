import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int arr[]={4,5,6,8,9,7,2,3,1};
        int min=FindMin(arr);
        int max=FindMax(arr);
        
        System.out.println("the smallest element in the arr " +min);
        System.out.println("the largest element in the arr " +max);
    }
    
    public static int FindMin(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int FindMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    return max;
    }
}