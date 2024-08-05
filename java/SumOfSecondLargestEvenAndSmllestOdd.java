
import java.util.*;
import java.util.Scanner;
public class Main{
    public static int SumOfSecondPos(int[] arr){
        if(arr.length ==0|| arr.length<=3){
            return 0;
        }
        
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
           
        }
         if(even.size()<2||odd.size()<2){
                return 0;
            }
        Collections.sort(even);
        Collections.sort(odd);
        
        int secondEven =even.get(even.size()-2);
        int secondOdd=odd.get(1);
        
        return secondEven+secondOdd;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1, 7, 5, 4};
        

        System.out.println(SumOfSecondPos(arr1));
        
    }
}
    
