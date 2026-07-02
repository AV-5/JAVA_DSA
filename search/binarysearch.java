package search;
import java.util.*;

public class binarysearch {

    public static int bin(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 7, -4, 3, -1, 0, 9};

        Arrays.sort(arr);

        int x = 3;

        System.out.println(Arrays.toString(arr));
        System.out.println("Element found at index: " + bin(arr, x));
    }
}