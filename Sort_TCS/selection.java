package Sort_TCS;

public class selection {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        for(int i=0;i<arr.length-1;i++){
            int min_idx=i;
            for(int j=i;j<arr.length-i-1;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;

        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
