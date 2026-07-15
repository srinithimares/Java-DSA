package DAY4;
import java.util.Scanner;

public class StrongNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Digit");
        int num=sc.nextInt();
        int sum=0;
      
        int original=num;
        while(num>0){
           
            int lastdigit=num%10;
             int factorial=1;
            for(int i=1;i<=lastdigit;i++){
              
               factorial=factorial*i;
            }
                sum=sum+factorial;
                 num=num/10;
               

            }
           

            if(sum==original){
                System.out.println("Strong Number");
            }
            else{
                System.out.println("not Strong Number");
            }
        
      
        sc.close();
       


        
    }
}




