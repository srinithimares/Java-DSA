package DAY5;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Digit1");
        int num1=sc.nextInt();
        System.out.println("Enter Digit2");
        int num2=sc.nextInt();

        int max;
        if(num1<num2){
            max=num2;
             }
                else{
                 max=num1;
                }
        int lcm=max;
        while(true){
            if(lcm % num1==0 && lcm% num2==0){
            break;  
            }
            lcm++;
        }
    
        System.out.println(lcm);
        
    
      sc.close();
       
       }
    }
        
    
