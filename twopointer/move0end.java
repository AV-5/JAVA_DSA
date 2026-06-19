package twopointer;
public class move0end {
    public static void main(String[] args) {
        int [] arr={1,6,3,0,8,4,0,3,5};
        int j=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
                k++;
            }
        }
        while(k<arr.length){
            arr[k]=0;
            k++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
