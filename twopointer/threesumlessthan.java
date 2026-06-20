package twopointer;
import java.util.*;
public class threesumlessthan {
    public static void main(String[] args) {
        int arr[]={1,-2,3,6,2,7,1,3};
        Arrays.sort(arr);
        int target=5;
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                 sum=arr[i]+arr[left]+arr[right];
            if(sum<=target){
                System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
                count++;
                left++;
            }
            if(sum>target){
                right--;
            }
            }
           
        }
        System.out.println("Numer of triplets: "+count);
    }
}
