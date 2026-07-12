package DAY3;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr={12,9,18,25,30,7};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
             else{
                odd++;
            }
        }
                System.out.println("even="+even);
                System.out.println("odd="+ odd);
                
                
                    
                
            

        
    }
    
}
