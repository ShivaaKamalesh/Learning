import java.util.*;
import java.util.Scanner;
public class Main{
    public static int differenceSum(int m,int n){
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                sum1+=i;
            }
            else{
                sum2+=i;
            }
        }
        return sum2-sum1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(differenceSum(m,n));
    }
    
}