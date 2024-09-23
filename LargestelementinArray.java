import java.util.Arrays;
public class LargestelementinArray {
    public static void main(String[] args) {
        int arr[]={10,39,50,60,80};
        Arrays.sort(arr); 
        int res=arr[arr.length-1];
        System.out.println("Largest Element is "+res);
    }
}
