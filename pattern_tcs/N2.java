package pattern_tcs;

public class N2 {
     public static void main(String[] args) {
        int n=5;
        int x=1;
        for(int i=1;i<=n;i++){
            x=1;
            for(int j=0;j<i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();

        }
    }
}
