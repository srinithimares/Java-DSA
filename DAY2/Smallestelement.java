public class Smallestelement {
    public static void main(String[] args) {
        int[] arr={20,5,30,10,15};
        int smallest =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }

        }
        System.out.println("smallest element=" + smallest);

    }
    
}
