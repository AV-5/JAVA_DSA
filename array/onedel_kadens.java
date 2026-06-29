package array;

public class onedel_kadens {

   public static int kad(int[] arr) {
    int noDel = arr[0];
    int oneDel = 0;
    int ans = arr[0];

    for (int i = 1; i < arr.length; i++) {

        int prevNoDel = noDel;

        noDel = Math.max(arr[i], noDel + arr[i]);

        oneDel = Math.max(prevNoDel, oneDel + arr[i]);

        ans = Math.max(ans, Math.max(noDel, oneDel));
    }

    return ans;
}

    public static void main(String[] args) {
        int[] arr = {1, -2, 4, 2, 5, -3, 7, -5};
        System.out.println(kad(arr));
    }
}