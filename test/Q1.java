import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= sc.nextInt();
        int b = 20;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        show();
    }
    public static void show(){
        System.out.println("Method running");
    }
}