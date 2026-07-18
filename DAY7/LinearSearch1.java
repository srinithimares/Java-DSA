package DAY7;

public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr={10,25,40,15,30};
        int key=15;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
 System.out.println("Element of the index="+i);
            
            found=true;
        }
    }
    if(!found){
        System.out.println("Element not Found");
    }
            
    }
}
