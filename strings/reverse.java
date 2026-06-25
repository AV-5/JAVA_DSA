package strings;
import java.util.Scanner;
public class reverse {
    public static String rev(String s){
        String s2="";
        for(int i=s.length()-1;i>=0;i--){
            s2=s2+s.charAt(i);
        }
        return s2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
    
        String s=sc.nextLine();
        System.out.println(rev(s));

    }
}
