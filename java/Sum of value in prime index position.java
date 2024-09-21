import java.util.*;
import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int value=sc.nextInt();
        
        int[] arr=new int[value];
        for(int i=0;i<value;i++){
            arr[i]=sc.nextInt();
        }
        int finval=sumPrimeIndexVal(arr,value);
        System.out.println(finval);
    }
    
    
    public static int sumPrimeIndexVal(int[] arr,int value){
        int sum=0;
        for(int i=2;i<value;i++){
            if(isPrime(i)){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}