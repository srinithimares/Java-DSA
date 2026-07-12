package DAY3;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter digit");
        int x=sc.nextInt();
        int reverse=0;
       
        while(x>0){
           int lastdigit=x%10;
            reverse=reverse*10+lastdigit;
            x=x/10;
            
        }
        System.out.println("reversenumber="+ reverse);
        sc.close();

        }
        
    }
    

