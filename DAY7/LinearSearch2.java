package DAY7;

public class LinearSearch2 {
    public static void main(String[] args) {
        int[]arr={12,23,34,45,67};
        int key=34;
        int index=-1;
        for(int i=0;i<arr.length;i++){
          if(key==arr[i]){
            index=i;
            break;
          }
        }
        System.out.println(index);
    }
    
}
