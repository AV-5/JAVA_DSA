package recursion;

public class power {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==1){
            return x;
        }
        return x*power(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(5,2));
    }
}
