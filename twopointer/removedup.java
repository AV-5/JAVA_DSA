package twopointer;

public class removedup {
    public static void main(String[] args) {
        int [] arr={1,1,1,2,2,3,4,4,4,5,5,5,5,5};
         int count=0;
        for(int i=0;i<arr.length;i++){
                if(arr[i]!=arr[count]){
                    count++;
                    arr[count]=arr[i];
                }
            }
            for (int i = 0; i <= count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
