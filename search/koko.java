package search;
import java.util.*;
public class koko {
    public static int eat(int[]arr,int max){
        int low=1;
        int high=0;
        for(int i=0;i<arr.length;i++){
            high=Math.max(arr[i], high);

        }
        while(low<high){
            int hours=0;
            int mid=low+(high-low)/2;
            for(int p:arr){
                hours += (p + mid - 1) / mid;
            }
            if(hours<=max){
                high=mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        System.out.println();
        int []arr={1,6,3,8,2};
        Arrays.sort(arr);
        int max=5;
        System.out.println(eat(arr,max));
    }
}
