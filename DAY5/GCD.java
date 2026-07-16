package DAY5;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Digit1");
        int num1=sc.nextInt();
        System.out.println("Enter Digit2");
        int num2=sc.nextInt();
       int min;
       int gcd=1;
       if(num1<num2){
        min=num1;
       }
         else{
                min=num2;
            }
         for(int i=1;i<=min;i++){
           
         if(num1 % i==0 && num2 % i==0) {
            gcd=i;
         }
        }
        System.out.println(gcd);
        
    
      sc.close();
       
       }
    }
        
    
