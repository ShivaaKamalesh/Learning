import java.util.*;
public class Main
{
    public static void Prime(int n){
        boolean prime=true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                prime=false;
            }
            else{
                prime=true;
            }
            
        }
        System.out.println(prime);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n=89;
	    Prime(n);
	    
	
	}
}