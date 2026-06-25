package Numbers;

import java.util.Scanner;

public class armstrong {
    public static boolean arm(int x){
        int sum=0;
        int og=x;
        int digit;
        String s=Integer.toString(x);
        while(x>0){
            digit=x%10;
            sum=sum+(int)Math.pow(digit,s.length());
            x=x/10;
        }
        return (og==sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x=sc.nextInt();
        System.out.println(arm(x));

    }
}
