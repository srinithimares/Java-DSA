package DAY4;
import java.util.Scanner;

public class ProductofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Digit");
        int num=sc.nextInt();
        int product=1;
        
        while(num>0){
            int lastdigit=num%10;
            product=product*lastdigit;
            num=num/10;
        }
        System.out.println("product of Digit="+product);
        sc.close();
       


        
    }
}



