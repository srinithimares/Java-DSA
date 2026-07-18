package DAY7;

public class BinarySearch {
    public static int num(int[] arr,int key) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
        
        int mid=(start+end)/2;
        
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }

        }
        return-1;
        }

        
    
    public static void main(String[]args){
        int[]arr={10,20,30,40,50,60};
        int key=50;
        int result=num(arr,key);
        System.out.println(result);
    }
}

    

