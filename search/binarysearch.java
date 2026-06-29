package search;
import java.util.*;
public class binarysearch {
    public static int bin(int[]arr,int x){
        int mid=arr.length/2;
        int left=0;
        int right=arr.length-1;
        if(x>arr[mid]){
            left=arr.length/2;
        }
        if(x<arr[mid]){
            right=arr.length/2;
        }
        if(x==mid){
            return mid;
        }
        for(int i=left;i<right;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={1,4,2,7,-4,3,-1,0,9};
        Arrays.sort(arr);
        int x=3;
        System.out.println("Element found at index: "+bin(arr,x));


    }
}
