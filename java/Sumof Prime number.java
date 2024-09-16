import java.util.*;
public class Main{
    public static boolean PrimeNum(int num){
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
    public static int PrimeSum(int num){
        int sum=0;
        for(int i=2;i<=num;i++){
            if(PrimeNum(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int num=10;
        System.out.println(PrimeSum(num));
    }
}