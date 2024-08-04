import java.util.*;
import java.util.Scanner;
public class Main{
    public static int differenceSum(int n,int m){
        int sumdiv=0;
        int sumnotdiv=0;
        
        for(int i=1;i<=m;i++){
            if(i%n==0){
                sumdiv+=i;}
            else{
                sumnotdiv+=i;
            }
            }
            return Math.abs(sumnotdiv - sumdiv); 
        }
    
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            System.out.println(differenceSum(n,m));
            
        }
    }