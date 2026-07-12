package DAY3;
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.print("Enter digit=");
        int numb= sc.nextInt();
       
        int digitcount=0;
       
        while (numb>0) {
            numb=numb/10;
            digitcount++;

        }
        System.out.println("digit=" +digitcount);
            
            
            
        }
        
    }
    

