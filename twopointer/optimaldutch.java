package twopointer;

public class optimaldutch {
    public static void main(String[] args) {
         int arr[] = {1, 2, 0, 2, 1, 0, 0, 2, 1};
         int temp,m=0;
         int l=0;
         int h=arr.length-1;
       
            while(m<=h){
            if(arr[m]==0){
                temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                l++;
                m++;
            }
            
            else if(arr[m]==1){
                m++;
            }
            else if(arr[m]==2){
                temp=arr[m];
                arr[m]=arr[h];
                arr[h]=temp;
                h--;
            }
            
         }
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
         
    }
}
