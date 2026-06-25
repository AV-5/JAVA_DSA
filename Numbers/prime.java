package Numbers;
import java.util.*;
public class prime {
    public static boolean prime(int x){
        int count=0;
        for(int i=2;i<x;i++){
            if(x%i==0){
                count++;
            }
        }
        return count<=0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x=sc.nextInt();
        System.out.println(prime(x));

    }
}
