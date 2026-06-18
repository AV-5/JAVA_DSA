package array;
class second_largest{
    public static void main(String[] args) {
        int [] arr={2,5,12,3,7,16,3,9};
        int m1=arr[0];
        int m2=arr[2];
        for(int i=2;i<arr.length;i++){
            if(arr[i]>m1){
                m2=m1;
                m1=arr[i];
            }
            else if(arr[i]>m2){
                m2=arr[i];
            }
            
        }
        System.out.println(m1+" "+m2);
    }
}