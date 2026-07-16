package DAY5;
import java.util.Scanner;

public class FactorofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Digit");
        int num=sc.nextInt();
       
        for(int i=1;i<=num;i++){
            if(num%i==0){
              
            System.out.println(i);
            }
        }

      
        sc.close();
       

    }
        
    }
