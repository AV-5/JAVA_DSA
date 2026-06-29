package array;
//Max sub array
//Kadenes used when negative numbers are involved
public class kadenes_algo {
    public static int kad(int[]arr){
        int max=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.max(arr[i],sum+arr[i]);
            max=Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr={1,-2,4,2,5,-3,7,-5};
        System.out.println(kad(arr));
        
    }
}
