package Numbers;

import java.util.Scanner;

public class factorial {
    public static int fact(int x){
        int y=1;
        for(int i=1;i<=x;i++){
            y=y*i;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x=sc.nextInt();
        System.out.println(fact(x));

    }
}
