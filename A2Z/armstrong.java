package A2Z;
// Problem Statement:Given an integer N, return true it is an Armstrong number otherwise return false.
// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
public class armstrong {
    public static boolean isArmstrong(int n) {
        int count=0;
        int digit=0;
        int num1=n;
        int num=n;
        int sum=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        while(num1!=0){
            digit=num1 % 10;
            sum=sum + (int)Math.pow(digit,count);
            num1=num1/10;
        }
        if(n==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
