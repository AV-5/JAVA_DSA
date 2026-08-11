package A2Z;

public class prime {
    public static void main(String[] args) {
        int num=23;
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("Not prime");
        }
        else{
            System.out.println("prime");
        }
        
    }
}
