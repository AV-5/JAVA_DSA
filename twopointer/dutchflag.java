package twopointer;

import java.util.HashMap;

public class dutchflag {

    public static void main(String[] args) {
        HashMap<Integer, Integer> list = new HashMap<>();
        int arr[] = {1, 2, 0, 2, 1, 0, 0, 2, 1};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (!list.containsKey(arr[i])) {
                list.put(arr[i], 1);
            } else {
                list.put(arr[i], list.get(arr[i]) + 1);
            }
        }
        System.out.println(list);
    }
}
