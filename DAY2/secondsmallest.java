public class secondsmallest {
    public static void main(String[] args) {
        int[] arr={50,30,80,60};
        int smallest=arr[0];
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                secondsmallest= smallest;
            smallest=arr[i];

            }else if(arr[i]>smallest&&arr[i]<secondsmallest){
                secondsmallest=arr[i];
            }
            }
        
        System.out.println("smallest="+smallest);
        System.out.println(" secondsmallest="+ secondsmallest);


    }
    
}
