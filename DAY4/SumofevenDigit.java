package DAY4;
import java.util.Scanner;

public class SumofevenDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Digit");
        int num=sc.nextInt();
        int sum=0;
        
        while(num>0){
            
           int  lastdigit=num%10;
           if(lastdigit%2!=0){
         
        sum+=lastdigit;
           
        }
         num=num/10;
    }
    
        
        System.out.println("Sum of even Digit="+sum);
        sc.close();
       


        
    }
}



