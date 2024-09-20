import java.util.*;
import java.util.Scanner;
public class Main{
    public static int findSumPrime(int[] arr,int value){
        
        int sum=0;
        int smallestPrime=Integer.MAX_VALUE;
        
        for(int i=0;i<value;i++){
            if(isPrime(arr[i])){
                sum+=arr[i];
                if(arr[i]<smallestPrime){
                    smallestPrime=arr[i];
                }
            }
        }
        if(smallestPrime!=Integer.MAX_VALUE){
            sum-=smallestPrime;
        }
        return sum;
    }
    public static boolean isPrime(int num){
        if(num<1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of elements");
        int value = sc.nextInt();
        
        int[] arr=new int[value];
        for(int i=0;i<value;i++){
            arr[i]=sc.nextInt();
        }
        
        
        int finalval=findSumPrime(arr,value);
        System.out.println(finalval);
    }
    
}