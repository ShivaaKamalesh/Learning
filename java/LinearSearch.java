import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int arr[]={8,5,6,9,7};
        int search=100;
        boolean found =false;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("value found at"+i);
                found=true;
            }
           
        }
        if(found==false){
            System.out.println("value not found");
        }
        
    }
}