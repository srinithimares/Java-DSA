package DAY1;

public class Largestelement {
    public static void main(String [] args){
        int[] arr = {15,35,10,50,25};
        int largest = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("largest ="+ largest);
    }
    
}
