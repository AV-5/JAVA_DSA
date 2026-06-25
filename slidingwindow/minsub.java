package slidingwindow;

public class minsub {

    public static void min(int[] arr, int target) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        while (high < arr.length) {
            sum += arr[high];
            while (sum > target) {
                len = Math.min(high - low + 1, len);
                sum -= arr[low];
                low++;
            }
            high++;

        }
        if(len==Integer.MAX_VALUE){
            System.out.println("No such subarray");
        }
        else{
            System.out.println(len);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 1, 3, 4, 5, 6};
        int target = 15;
        min(arr, target);
    }

}
