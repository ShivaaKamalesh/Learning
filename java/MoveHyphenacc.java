import java.util.*;
import java.util.Scanner;
public class Main{
    public static String RemoveHyphen(String str ,int n){
        if(str==null){
            return null;
        }
        
        StringBuilder hyphen=new StringBuilder();
        StringBuilder letter=new StringBuilder();
        
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='-'){
                hyphen.append('-');
            }
            else{
                letter.append(str.charAt(i));
            }
        }
        return hyphen.toString() + letter.toString(); 
        
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String strr=sc.nextLine();
        int n1=strr.length();
        System.out.println(RemoveHyphen(strr,n1));
    }
}