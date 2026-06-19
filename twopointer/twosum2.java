package twopointer;
import java.util.*;
public class twosum2 {
    public static void main(String[] args) {
        int x=9;
        int [] arr={2,11,17,7,15};
        Arrays.sort(arr);
        int i=0;int j=arr.length-1;
        while(i<j){
            if((arr[i] + arr[j]) == x){
                System.out.println("Found");
                System.out.println(arr[i] +" "+arr[j]);
                return;
            }
            else if((arr[i] + arr[j]) > x){
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("sum does not exist");
    }
}
