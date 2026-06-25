package Numbers;

import java.util.Scanner;

public class perfectnum {
    public static boolean perfect(int x){
        int sum=0;
        for(int i=1;i<x;i++){
            if(x%i==0){
                sum=sum+i;
            }
        }
        return (sum==x);
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x=sc.nextInt();
        System.out.println(perfect(x));

    }
}
