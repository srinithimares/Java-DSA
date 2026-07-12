package DAY3;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number"); 
       int x=sc.nextInt();
       int original=x;
       int reverse=0;
       while(x>0){
        int lastdigit=x%10;
        reverse=reverse*10+lastdigit;
        x=x/10;

       }
       if(original==reverse){
        System.out.println("palindrome");
       }
       else{
        System.out.println("not palindrome");
    }
    sc.close();
    }
}