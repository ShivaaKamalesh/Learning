/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.Scanner;
public class Main{
    public static int rat(int r,int unit,int arr[],int n)
    {
        if(arr==null)
            return -1;
        int res=r*unit;
        int sum=0;
        int count=0;
        
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            count++;
            if(sum>=res)
                break;
        }
        if(sum<res)
            return 0;
        return count;
    }    
        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            int r = sc.nextInt ();
            int unit = sc.nextInt ();
            int n = sc.nextInt ();
            int arr[] = new int[n];
            
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            System.out.println(rat(r,unit,arr,n));
        }
    }
