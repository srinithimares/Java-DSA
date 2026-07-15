package DAY4;
import java.util.Scanner;

public class CountevenDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Digit");
        int num=sc.nextInt();
        int count=0;
        
        while(num>0){
           
            int lastdigit=num%10;
        if(lastdigit%2==0){
            count++;
        }
            num=num/10;
        }
        System.out.println("Even Count Digit="+count);
        sc.close();
       


        
    }
}




