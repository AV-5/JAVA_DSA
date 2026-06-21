package slidingwindow;

public class maxsub {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 1, 3, 4, 5, 6};
        int k = 2;
        int sum = 0;
        for (int i = 0; i <= k; i++) {
            sum = sum + arr[i];
        }
        int max = sum;
        int low = 0;
        int high = k;
        while (high < arr.length-1) {
            high++;
            sum=sum-arr[low]+arr[high];
            low++;
            if(sum>max){
                max=sum;
            }
            
        }
        System.out.println("Max: " + max);
    }
}
