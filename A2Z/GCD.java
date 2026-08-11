package A2Z;
// Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

import java.util.Scanner;

public class GCD {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD: "+ gcd(a, b));
    }
}
