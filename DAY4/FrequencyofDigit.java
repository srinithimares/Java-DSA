package DAY4;
import java.util.Scanner;

public class FrequencyofDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number");
         int num=sc.nextInt();
        System.out.print("Enter Digit");
       
        int digit=sc.nextInt();
        int count=0;
        
        while(num>0){
           
            int lastdigit=num%10;
        if(lastdigit==digit){
            count++;
        }
            num=num/10;
        }
        System.out.println("Frequency of Digit="+count);
        sc.close();
       


        
    }
}




