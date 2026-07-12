package DAY3;

public class PositiveNegative {
    public static void main(String[] args) {
        int[]arr={ 2,5,-7,8,-3,0};
        int positive=0;
        int negative=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                positive++;
            }
        
        else{
            negative++;
        }
    }
    
    System.out.println("positive count="+positive);
    System.out.println("negative count="+negative);
    
    
}
}
