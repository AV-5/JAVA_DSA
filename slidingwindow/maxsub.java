package slidingwindow;

public class maxsub {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 1, 3, 4, 5, 6};
        int low = 0;
        int high = 2;
        int max = 0;
            while (low < high && high<arr.length) {
                int sum = arr[low] + arr[low + 1] + arr[high];
                low++;
                high++;
                if (sum > max) {
                    max = sum;
                }
            }

        
        System.out.println("Max: " + max);
    }
}
