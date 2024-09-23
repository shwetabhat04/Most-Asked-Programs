public class To_find_Largest_smallest {
    public static void main(String[] args) {
        int arr[]={40,60,20,10};
        int largest=arr[0],smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i])
                smallest=arr[i];
            if(largest<arr[i])
                largest=arr[i];
        }
        System.out.println("Smallest Element is "+smallest);
        System.out.println("Largest Element is "+largest);
    }
}
