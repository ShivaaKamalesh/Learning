import java.util.*;
import java.util.Scanner;
public class Main{
    public static int CheckPass(char[] str,int n){
        if(n<4){
            return 0;
        }
        
        if(Character.isDigit(str[0])){
            return 0;
        }
        
        boolean hasDigit=false;
        boolean hasCapitalLetter=false;
        boolean hasInvalidChar=false;
        
        for(int i=0;i<n;i++){
            
            char ch=str[i];
            if(Character.isDigit(ch)){
                hasDigit=true;
            }
            if(Character.isUpperCase(ch)){
                hasCapitalLetter=true;
            }
            if(ch==' '||ch=='/'){
                hasInvalidChar=true;
            }
        }
        if(hasDigit&&hasCapitalLetter&&hasInvalidChar){
            return 1;
        }
            else{
                return 0;
            }
        }
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            String input=sc.nextLine();
            char[] str=input.toCharArray();
            int n =str.length;
            System.out.println(CheckPass(str, n));
        }
    }
