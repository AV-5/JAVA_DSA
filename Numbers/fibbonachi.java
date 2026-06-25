package Numbers;

import java.util.Scanner;

public class fibbonachi {
    public static void fibo(int x){
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<x;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x=sc.nextInt();
        fibo(x);

    }
}
