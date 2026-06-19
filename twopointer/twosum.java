package twopointer;

import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> list =new HashMap<>();
        int x=9;
        int [] arr={2,11,17,7,15};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>9){
                 int comp=arr[i]-9;
            }
            int comp= 9-arr[i];
            if(list.containsValue(comp)){
                System.out.println("True");
                System.out.println(list.get(comp));
                System.out.println(comp);
            }
            list.put( arr[i],i);
        }
        System.out.println(list);
       
    }

}
