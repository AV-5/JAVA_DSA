package slidingwindow;

public class variablemaxsub {

    public static void varsub(int[] arr, int target) {

        int low = 0;
        int high = 0;
        int sum = 0;

        while (high < arr.length) {

            // Expand the window
            sum += arr[high];

            // Shrink the window while condition is satisfied
            while (sum > target) {

                // Current window
                for (int i = low; i <= high; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();

                sum -= arr[low];
                low++;
            }

            high++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 2, 1, 3, 4, 5, 6};
        int target = 5;

        varsub(arr, target);
    }
}
