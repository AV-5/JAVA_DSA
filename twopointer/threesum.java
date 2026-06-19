package twopointer;
import java.util.Arrays;

public class threesum {
    public static void main(String[] args) {
        int arr[]={-1,3,1,6,-2,7,-1};
        int target=0;
        Arrays.sort(arr);

for (int i = 0; i < arr.length - 2; i++) {

    int left = i + 1;
    int right = arr.length - 1;

    while (left < right) {

        int sum = arr[i] + arr[left] + arr[right];

        if (sum == target) {
            System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
            left++;
            right--;
        }
        else if (sum < target) {
            left++;
        }
        else {
            right--;
        }
    }
}}}