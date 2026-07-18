package DAY6;
import java.util.Scanner;

public class PowerofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Digit");
        int a=sc.nextInt();
        System.out.println("Enter Power");
        int b=sc.nextInt();
       int result=1;
       
        for(int i=1;i<=b;i++){
            result=result*a;
        }
        System.out.println(result);

      
        sc.close();
       

    }
        
    }
