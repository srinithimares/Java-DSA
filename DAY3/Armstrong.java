package DAY3;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Digit");
        int num=sc.nextInt();
        int sum=0;
        int original=num;
        while(num>0){
            int lastdigit=num%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            num=num/10;
        }
        if(sum==original){
            System.out.println("Armstrong");

        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();



        
    }
}
