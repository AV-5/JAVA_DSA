package recursion;
//Check whether the given array is sorted or not
public class check_array {
    public static boolean sort_check(int []arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return sort_check(arr, idx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,3,4};
        System.out.println(sort_check(arr, 0));
    }
}
